
void display(int *limits) {
    for (int i = limits[0] + 1; i < limits[1]; i++) {
        printf("%d ", i);
    }
    printf("\n");
}

int main() {
    int limits[2];
    printf("Enter lower and upper limits: ");
    scanf("%d %d", &limits[0], &limits[1]);
    display(limits);
    return 0;
}
