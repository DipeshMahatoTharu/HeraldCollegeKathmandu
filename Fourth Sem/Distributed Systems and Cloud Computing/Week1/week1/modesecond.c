#include <stdio.h>
#include <mpi.h>

int main(int argc, char** argv) {
    int size, rank;

    MPI_Init(NULL, NULL);
    MPI_Comm_size(MPI_COMM_WORLD, &size);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);

    if (size < 2) {
        if (rank == 0) {
            printf("This program needs at least 2 processes to run\n");
        }
    } else {
        if (rank == 0) {
            // Process 0 sends different values to each process
            for (int i = 1; i < size; i++) {
                int value = 10 * i;  // Unique value for each process
                MPI_Send(&value, 1, MPI_INT, i, 0, MPI_COMM_WORLD);
                printf("Process 0 sent %d to Process %d\n", value, i);
            }
        } else {
            // All processes other than rank 0 should receive a message
            int number;
            MPI_Recv(&number, 1, MPI_INT, 0, 0, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
            printf("Process %d received %d\n", rank, number);
        }
    }

    MPI_Finalize();
    return 0;
}
