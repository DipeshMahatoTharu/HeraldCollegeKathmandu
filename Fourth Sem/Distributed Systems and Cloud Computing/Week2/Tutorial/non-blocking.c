#include <stdio.h>
#include <mpi.h>

#define DATA_SIZE 100  // Define the size of the data array

int compute(int i) {
    return i * i;  // Example computation
}

void consume(int value) {
    printf("Consumed value: %d\n", value);
}

int main(int argc, char *argv[]) {
    int rank, i;
    int data[DATA_SIZE];
    MPI_Request request[DATA_SIZE];
    MPI_Status status;

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);

    if (rank == 0) {
        // Rank 0: Compute and send data using non-blocking sends
        for (i = 0; i < DATA_SIZE; i++) {
            printf("i = %d, Rank 0 computing...\n", i);
            data[i] = compute(i);
            printf("i = %d, Rank 0 sending data to Rank 1\n", i);
            MPI_Isend(&data[i], 1, MPI_INT, 1, 0, MPI_COMM_WORLD, &request[i]);
        }
        
        // Ensure all non-blocking sends are completed
        MPI_Waitall(DATA_SIZE, request, MPI_STATUSES_IGNORE);
        printf("Rank 0 finished sending all data to Rank 1\n");
    } 
    else if (rank == 1) {  
        // Rank 1: Receive data and process it
        for (i = 0; i < DATA_SIZE; i++) {
            printf("i = %d, Rank 1 waiting for data...\n", i);
            MPI_Recv(&data[i], 1, MPI_INT, 0, 0, MPI_COMM_WORLD, &status);
            printf("i = %d, Rank 1 processing data...\n", i);
            consume(data[i]);
        }
        printf("Rank 1 finished receiving and processing all data.\n");
    }

    MPI_Finalize();
    return 0;
}