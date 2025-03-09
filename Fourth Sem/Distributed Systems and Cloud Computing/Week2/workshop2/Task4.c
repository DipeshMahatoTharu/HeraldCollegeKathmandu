#include <mpi.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
    int size, rank;
    int tag = 0;
    int count;
    MPI_Status status;

    MPI_Init(&argc, &argv);
    MPI_Comm_size(MPI_COMM_WORLD, &size);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);

    if (rank == 0) {
        for (int i = 0; i < size - 1; i++) {
            // First receive the size of the data
            int data_size;
            MPI_Recv(&data_size, 1, MPI_INT, MPI_ANY_SOURCE, MPI_ANY_TAG, MPI_COMM_WORLD, &status);

            // Allocate memory based on the received size
            int *data = (int *)malloc(data_size * sizeof(int));
            if (data == NULL) {
                fprintf(stderr, "Memory allocation failed\n");
                MPI_Abort(MPI_COMM_WORLD, 1);
            }

            // Now receive the actual data
            MPI_Recv(data, data_size, MPI_INT, status.MPI_SOURCE, status.MPI_TAG, MPI_COMM_WORLD, &status);
            MPI_Get_count(&status, MPI_INT, &count);

            // Print received data info
            printf("Node ID: %d; tag: %d; MPI_Get_count: %d;\n", status.MPI_SOURCE, status.MPI_TAG, count);

            // Free allocated memory
            free(data);
        }
    } else {
        // Generate a random size for data
        int data_size = rand() % 100;

        // Send the size of the data first
        MPI_Send(&data_size, 1, MPI_INT, 0, tag, MPI_COMM_WORLD);

        // Allocate memory and fill with data
        int *data = (int *)malloc(data_size * sizeof(int));
        if (data == NULL) {
            fprintf(stderr, "Memory allocation failed\n");
            MPI_Abort(MPI_COMM_WORLD, 1);
        }
        for (int i = 0; i < data_size; i++) {
            data[i] = rank * 10 + i;  // Example data
        }

        // Send the actual data
        MPI_Send(data, data_size, MPI_INT, 0, tag, MPI_COMM_WORLD);

        // Free allocated memory
        free(data);
    }

    MPI_Finalize();
    return 0;
}
