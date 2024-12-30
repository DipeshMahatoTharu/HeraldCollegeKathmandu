#include <stdio.h>

struct Employee {
    char empName[50];
    int age;
    float salary;
};

int main() {
    struct Employee newEmployee;
    FILE *file = fopen("C:\\Third semester\\C-programming\\workshop6\\newemployee.txt", "a");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }

    printf("Enter new employee details:\n");
    printf("Name: ");
    scanf("%s", newEmployee.empName);
    printf("Age: ");
    scanf("%d", &newEmployee.age);
    printf("Salary: ");
    scanf("%f", &newEmployee.salary);

    fprintf(file, "Name: %s, Age: %d, Salary: %.2f\n", newEmployee.empName, newEmployee.age, newEmployee.salary);

    fclose(file);
    printf("New employee details added to newemployee.txt.\n");
    return 0;
}

