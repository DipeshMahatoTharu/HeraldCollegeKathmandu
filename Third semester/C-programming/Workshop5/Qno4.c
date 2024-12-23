
typedef struct {
    char name[50];
    char post[50];
    float salary;
} Employee;

int filterEmployees(Employee employees[], Employee result[], int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (employees[i].salary > 10000) {
            result[count++] = employees[i];
        }
    }
    return count;
}

int main() {
    Employee employees[NUM_EMPLOYEES], filtered[NUM_EMPLOYEES];
    int count;

    for (int i = 0; i < NUM_EMPLOYEES; i++) {
        printf("Enter name, post, and salary of employee %d:\n", i + 1);
        scanf("%s %s %f", employees[i].name, employees[i].post, &employees[i].salary);
    }

    count = filterEmployees(employees, filtered, NUM_EMPLOYEES);
    printf("\nEmployees with salary > 10,000:\n");
    for (int i = 0; i < count; i++) {
        printf("Name: %s, Post: %s, Salary: %.2f\n", filtered[i].name, filtered[i].post, filtered[i].salary);
    }

    return 0;
}
