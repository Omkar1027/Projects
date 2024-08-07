public class two {
    public static void main(String[] args) {
        // Creating objects and assigning references
        String str1 = "Hello";
        String str2 = str1; // str2 now refers to the same object as str1

        // Modifying str2
        str2 = str2 + " World";

        // Printing values
        System.out.println("str1: " + str1); // Output: str1: Hello
        System.out.println("str2: " + str2); // Output: str2: Hello World
    }
}
