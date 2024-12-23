
// Task 3: Student Structure
#include <stdio.h>
#define NUM_STUDENTS 10

typedef struct {
    char name[20];
    int roll;
    float marks;
} Student;

void readStudents(Student students[], int n) {
    for (int i = 0; i < n; i++) {
        printf("Enter name, roll number, and marks of student %d:\n", i + 1);
        scanf("%s %d %f", students[i].name, &students[i].roll, &students[i].marks);
    }
}

void displayStudents(Student students[], int n) {
    for (int i = 0; i < n; i++) {
        printf("Name: %s, Roll: %d, Marks: %.2f\n", students[i].name, students[i].roll, students[i].marks);
    }
}

int main() {
    Student students[NUM_STUDENTS];
    readStudents(students, NUM_STUDENTS);
    printf("\nStudent Records:\n");
    displayStudents(students, NUM_STUDENTS);
    return 0;
}31
31
