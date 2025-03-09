#include <mpi.h>
#include <stdio.h>
#define NUMDATA 10000

void LoadData(int data[], int size) {
    for (int i = 0; i < size; i++) {
        data[i] = 1;
    }
}

int main(int argc, char *argv[]) {
    int rank, size;
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    int local_sum = 0, global_sum = 0;
    int chunk_size = NUMDATA / size;
    int remainder = NUMDATA % size;
    int local_data[chunk_size + (rank < remainder ? 1 : 0)];
    
    if (rank == 0) {
        int data[NUMDATA];
        LoadData(data, NUMDATA);
        int offset = 0;
        for (int i = 0; i < size; i++) {
            int send_count = chunk_size + (i < remainder ? 1 : 0);
            if (i == 0) {
                for (int j = 0; j < send_count; j++)
                    local_data[j] = data[offset + j];
            } else {
                MPI_Send(&data[offset], send_count, MPI_INT, i, 0, MPI_COMM_WORLD);
            }
            offset += send_count;
        }
    } else {
        MPI_Recv(local_data, chunk_size + (rank < remainder ? 1 : 0), MPI_INT, 0, 0, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
    }

    for (int i = 0; i < chunk_size + (rank < remainder ? 1 : 0); i++) {
        local_sum += local_data[i];
    }

    MPI_Reduce(&local_sum, &global_sum, 1, MPI_INT, MPI_SUM, 0, MPI_COMM_WORLD);
    
    if (rank == 0) {
        printf("The total sum of data is %d\n", global_sum);
    }
    
    MPI_Finalize();
    return 0;
}