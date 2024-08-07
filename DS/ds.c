#include <stdio.h>

// Define the structure for student information
struct Student {
    char name[42];
    int roll;
    float marks;
};

// Function to write student information to a file
void writeToFile(struct Student student) {
    FILE *file = fopen("student_info.txt", "w");
    if (file == NULL) {
        printf("Error opening file!\n");
        return;
    }
    fprintf(file, "Name: %s\n", student.name);
    fprintf(file, "Roll: %d\n", student.roll);
    fprintf(file, "Marks: %.2f\n", student.marks);
    fclose(file);
    printf("Data written to file successfully.\n");
}

// Function to read student information from a file
void readFromFile() {
    FILE *file = fopen("student_info.txt", "r");
    if (file == NULL) {
        printf("Error opening file!\n");
        return;
    }
    struct Student student;
    fscanf(file, "Name: %3[^\n]\n", student.name);
    fscanf(file, "Roll: %d\n", &student.roll);
    fscanf(file, "Marks: %f\n", &student.marks);
    fclose(file);

    printf("Data read from file:\n");
    printf("Name: %s\n", student.name);
    printf("Roll: %d\n", student.roll);
    printf("Marks: %.2f\n", student.marks);
}

int main() {
    struct Student student;

    // Input student information
    printf("Enter name: ");
    fgets(student.name, sizeof(student.name), stdin);
    student.name[strcspn(student.name, "\n")] = 0; // Remove newline character
    printf("Enter roll number: ");
    scanf("%d", &student.roll);
    printf("Enter marks: ");
    scanf("%f", &student.marks);

    // Write to file
    writeToFile(student);

    // Read from file
    readFromFile();

    return 0;
}
