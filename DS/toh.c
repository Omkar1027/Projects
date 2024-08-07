// #include <stdio.h>

// // Function to move disks from source to destination using auxiliary peg
// void moveDisks(int n, char source, char destination, char auxiliary) {
//     if (n == 1) {
//         printf("Move disk 1 from %c to %c\n", source, destination);
//         return;
//     }
    
//     // Move n-1 disks from source to auxiliary, so they are out of the way
//     moveDisks(n - 1, source, auxiliary, destination);
    
//     // Move the nth disk from source to destination
//     printf("Move disk %d from %c to %c\n", n, source, destination);
    
//     // Move the n-1 disks that we left on auxiliary to destination
//     moveDisks(n - 1, auxiliary, destination, source);
// }

// int main() {
//     int n; // Number of disks
    
//     printf("Enter the number of disks: ");
//     scanf("%d", &n);
    
//     // Call the function with source peg 'A', destination peg 'C', and auxiliary peg 'B'
//     moveDisks(n, 'A', 'C', 'B');
    
//     return 0;
// }
















#include <stdio.h>
#include <math.h>

// Function to calculate number of steps required
int numberOfSteps(int n) {
    return pow(2, n) - 1;
}

int main() {
    int n; // Number of disks
    
    printf("Enter the number of disks: ");
    scanf("%d", &n);
    
    int steps = numberOfSteps(n);
    printf("Number of steps required to solve Tower of Hanoi with %d disks: %d\n", n, steps);
    
    return 0;
}
