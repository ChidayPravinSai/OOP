package week2;

public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat(" World"); // does not change original string
        System.out.println(s1); // Output: Hello

        // To modify, assign the result
        s1 = s1.concat(" World");
        System.out.println(s1); // Output: Hello World
    }
}