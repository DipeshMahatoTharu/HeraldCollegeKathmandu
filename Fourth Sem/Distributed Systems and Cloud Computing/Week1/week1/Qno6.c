#include <stdio.h>
#include <mpi.h>

int is_prime(int num) {
    if (num < 2) return 0; // 0 and 1 are not prime
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return 0;
    }
    return 1;
}

int main(int argc, char **argv) {
    int rank, size;
    int nstart = 1, nfinish = 10000;
    
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    int chunk_size = (nfinish - nstart + 1) / size;  // Divide work among processes
    int start = nstart + rank * chunk_size;
    int end = (rank == size - 1) ? nfinish : start + chunk_size - 1;

    printf("Process %d checking range %d to %d\n", rank, start, end);

    for (int i = start; i <= end; i++) {
        if (is_prime(i)) {
            printf("Process %d: %d\n", rank, i);
        }
    }

    MPI_Finalize();
    return 0;
}
