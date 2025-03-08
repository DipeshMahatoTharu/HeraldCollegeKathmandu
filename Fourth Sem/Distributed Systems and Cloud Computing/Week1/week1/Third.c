#include <stdio.h>
#include <mpi.h>
#include <unistd.h>

int main(int argc, char** argv) {
    int size, rank;

    MPI_Init(NULL, NULL);
    MPI_Comm_size(MPI_COMM_WORLD, &size);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);

    if (size != 3) {
        if (rank == 0) {
            printf("This program needs exactly 3 processes to run\n");
        }
    } else {
        if (rank == 0) {
            int x, y;
            MPI_Request reqs[2];
            MPI_Status stats[2];

            // Non-blocking receives
            MPI_Irecv(&x, 1, MPI_INT, 1, 0, MPI_COMM_WORLD, &reqs[0]);
            MPI_Irecv(&y, 1, MPI_INT, 2, 0, MPI_COMM_WORLD, &reqs[1]);

            // Wait for both messages
            MPI_Waitall(2, reqs, stats);

            printf("Received %d from process %d\n", x, 1);
            printf("Received %d from process %d\n", y, 2);
        } else {
            if (rank == 1) {
                usleep(5000000);  // Process 1 sleeps for 5 seconds
            }
            int number = rank + 10;
            MPI_Send(&number, 1, MPI_INT, 0, 0, MPI_COMM_WORLD);
        }
    }

    MPI_Finalize();
    return 0;
}
