/*Write an MPI program called pingpong.c to run with exactly 2 processes. Process rank 0 is to send an integer
variable called "ball" initialised with the value zero to Process rank 1. Process rank 1 will add 1 to the ball and
send it back. This will repeat until the ball has a value of 10 in Process rank 0.*/
#include <mpi.h>
#include <stdio.h>

#define MAX_VALUE 10

int main(int argc, char** argv) {
    int rank, size;
    int ball = 0;

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    if (size != 2) {
        if (rank == 0) {
            printf("This program requires exactly 2 processes.\n");
        }
        MPI_Finalize();
        return 1;
    }

    if (rank == 0) {
        printf("Starting ping-pong with ball = %d\n", ball);

        while (ball < MAX_VALUE) {
            // Send ball to process 1
            MPI_Send(&ball, 1, MPI_INT, 1, 0, MPI_COMM_WORLD);
            printf("Process 0 sent ball = %d to Process 1\n", ball);

            // Receive updated ball from process 1
            MPI_Recv(&ball, 1, MPI_INT, 1, 0, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
            printf("Process 0 received ball = %d from Process 1\n", ball);
        }
    } else if (rank == 1) {
        while (1) {
            // Receive ball from process 0
            MPI_Recv(&ball, 1, MPI_INT, 0, 0, MPI_COMM_WORLD, MPI_STATUS_IGNORE);
            printf("Process 1 received ball = %d from Process 0\n", ball);

            if (ball >= MAX_VALUE) break;

            ball++; // Increment the ball

            // Send ball back to process 0
            MPI_Send(&ball, 1, MPI_INT, 0, 0, MPI_COMM_WORLD);
            printf("Process 1 sent ball = %d to Process 0\n", ball);
        }
    }

    MPI_Finalize();
    return 0;
}
