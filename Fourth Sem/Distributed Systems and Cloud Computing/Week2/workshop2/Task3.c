/*Write a "Pass-the-parcel" MPI program that will run with 3 or more nodes, such that Process rank 0 will send an
integer variable call "parcel" initialised with 1, to Process rank 1 which will add 1 to the parcel and then send it to
Process rank 2, and so on until the highest rank process will send it back to Process rank 0, at which point the
parcel variable should contain the value of the number of nodes there are.*/
#include <mpi.h>
#include <stdio.h>

int main(int argc, char** argv) {
    int rank, size;
    int parcel = 0;

    // Initialize the MPI environment
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank); // Get the rank of the process
    MPI_Comm_size(MPI_COMM_WORLD, &size); // Get the total number of processes

    if (size < 3) {
        if (rank == 0) {
            printf("This program requires at least 3 processes.\n");
        }
        MPI_Finalize();
        return 0;
    }

    if (rank == 0) {
        // Initialize the parcel and send it to rank 1
        parcel = 1;
        printf("Process %d sending parcel %d to process %d\n", rank, parcel, rank + 1);
        MPI_Send(&parcel, 1, MPI_INT, rank + 1, 0, MPI_COMM_WORLD);

        // Receive final parcel value from the last process
        MPI_Recv(&parcel, 1, MPI_INT, size - 1, 0, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
        printf("Process %d received final parcel value %d from process %d\n", rank, parcel, size - 1);

        // Check if the final value is correct
        if (parcel == size) {
            printf("Final parcel value is correct!\n");
        } else {
            printf("Final parcel value is incorrect!\n");
        }
    } else {
        // Receive the parcel from the previous process
        MPI_Recv(&parcel, 1, MPI_INT, rank - 1, 0, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
        printf("Process %d received parcel %d from process %d\n", rank, parcel, rank - 1);

        // Increment the parcel value
        parcel++;

        if (rank == size - 1) {
            // If it's the last process, send the parcel back to rank 0
            printf("Process %d sending parcel %d back to process 0\n", rank, parcel);
            MPI_Send(&parcel, 1, MPI_INT, 0, 0, MPI_COMM_WORLD);
        } else {
            // Otherwise, send to the next process
            printf("Process %d sending parcel %d to process %d\n", rank, parcel, rank + 1);
            MPI_Send(&parcel, 1, MPI_INT, rank + 1, 0, MPI_COMM_WORLD);
        }
    }

    // Finalize the MPI environment
    MPI_Finalize();
    return 0;
}
