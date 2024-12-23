
typedef struct {
    char name[50];
    float salary;
    int hours;
} Employee;

float findHighestSalary(Employee *employees, int n) {
    float highest = employees[0].salary;
    for (int i = 1; i < n; i++) {
        if (employees[i].salary > highest) {
            highest = employees[i].salary;
        }
    }
    return highest;
}

int main() {
    int n;
    printf("Enter the number of employees: ");
    scanf("%d", &n);

    Employee *employees = (Employee *)malloc(n * sizeof(Employee));
    for (int i = 0; i < n; i++) {
        printf("Enter name, salary, and hours of work for employee %d:\n", i + 1);
        scanf("%s %f %d", employees[i].name, &employees[i].salary, &employees[i].hours);
    }

    float highest = findHighestSalary(employees, n);
    printf("\nHighest Salary: %.2f\n", highest);

    free(employees);
    return 0;
}
