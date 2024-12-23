
typedef struct {
    char name[50];
    float salary;
    int hours;
} Employee;

void calculateSalary(Employee employees[], int n) {
    for (int i = 0; i < n; i++) {
        if (employees[i].hours >= 12) {
            employees[i].salary += 150;
        } else if (employees[i].hours >= 10) {
            employees[i].salary += 100;
        } else if (employees[i].hours >= 8) {
            employees[i].salary += 50;
        }
    }
}

int main() {
    Employee employees[5];
    for (int i = 0; i < 5; i++) {
        printf("Enter name, salary, and hours of work for employee %d:\n", i + 1);
        scanf("%s %f %d", employees[i].name, &employees[i].salary, &employees[i].hours);
    }

    calculateSalary(employees, 5);
    printf("\nEmployee Records After Increment:\n");
    for (int i = 0; i < 5; i++) {
        printf("Name: %s, Final Salary: %.2f\n", employees[i].name, employees[i].salary);
    }

    return 0;
}
