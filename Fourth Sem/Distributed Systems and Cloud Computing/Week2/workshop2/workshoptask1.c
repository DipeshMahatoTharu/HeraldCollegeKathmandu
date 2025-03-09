#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <mpi.h>

#define ALPHABET_SIZE 26

// Function to count letter occurrences in a chunk of text
void count_letters(char *text, int size, int *local_count) {
    for (int i = 0; i < size; i++) {
        char c = tolower(text[i]);
        if (c >= 'a' && c <= 'z') {
            local_count[c - 'a']++;
        }
    }
}

int main(int argc, char **argv) {
    int rank, size;
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    int global_count[ALPHABET_SIZE] = {0};
    int local_count[ALPHABET_SIZE] = {0};
    char *buffer = NULL;
    long file_size = 0;
    int chunk_size;

    if (rank == 0) {
        // Read file in rank 0
        FILE *fp = fopen("WarAndPeace.txt", "r");
        if (fp == NULL) {
            printf("Error opening file.\n");
            MPI_Abort(MPI_COMM_WORLD, 1);
            return 1;
        }

        // Get file size
        fseek(fp, 0, SEEK_END);
        file_size = ftell(fp);
        fseek(fp, 0, SEEK_SET);

        // Allocate buffer and read file
        buffer = (char *)malloc(file_size * sizeof(char));
        fread(buffer, sizeof(char), file_size, fp);
        fclose(fp);

        // Determine chunk size
        chunk_size = file_size / size;
    }

    // Broadcast chunk size to all processes
    MPI_Bcast(&chunk_size, 1, MPI_INT, 0, MPI_COMM_WORLD);

    // Allocate memory for the chunk in each process
    char *chunk = (char *)malloc((chunk_size + 1) * sizeof(char));

    // Scatter chunks to each process
    MPI_Scatter(buffer, chunk_size, MPI_CHAR, chunk, chunk_size, MPI_CHAR, 0, MPI_COMM_WORLD);

    // Each process counts its own chunk
    count_letters(chunk, chunk_size, local_count);

    // Reduce results to rank 0
    MPI_Reduce(local_count, global_count, ALPHABET_SIZE, MPI_INT, MPI_SUM, 0, MPI_COMM_WORLD);

    // Rank 0 prints results
    if (rank == 0) {
        printf("\nLetter Frequency:\n");
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            printf("%c: %d\n", 'a' + i, global_count[i]);
        }
        free(buffer);
    }

    // Free memory and finalize MPI
    free(chunk);
    MPI_Finalize();

    return 0;
}
