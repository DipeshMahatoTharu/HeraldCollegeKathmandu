#include <stdio.h>

struct Employee {
    char empName[50];
    int age;
    float salary;
};

int main() {
    struct Employee employees[5];
    FILE *file = fopen("C:\\Third semester\\C-programming\\workshop6\\employee.txt", "w");

    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }

    for (int i = 0; i < 5; i++) {
        printf("Enter details of employee %d:\n", i + 1);
        printf("Name: ");
        scanf("%s", employees[i].empName);
        printf("Age: ");
        scanf("%d", &employees[i].age);
        printf("Salary: ");
        scanf("%f", &employees[i].salary);

        fprintf(file, "Name: %s, Age: %d, Salary: %.2f\n", employees[i].empName, employees[i].age, employees[i].salary);
    }

    fclose(file);
    printf("Employee details written to employee.txt.\n");
    return 0;
}
