package week2;

public class StringBufferBuilder {
    public static void main(String[] args) {
       
        String str = "Hello";
        System.out.println("Original String: " + str);
        str = str.concat(" World");  // Returns a new string
        System.out.println("After concat: " + str);
        System.out.println("Using substring(0,5): " + str.substring(0, 5));
        System.out.println("Is str equals 'Hello World'? " + str.equals("Hello World"));
        System.out.println("Length of str: " + str.length());
        System.out.println("Character at index 4: " + str.charAt(4));

        System.out.println("\n---");

    
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("Original StringBuffer: " + sbf);
        sbf.append(" Programming");
        System.out.println("After append: " + sbf);
        sbf.insert(5, "Language ");
        System.out.println("After insert: " + sbf);
        sbf.replace(5, 13, "Core ");
        System.out.println("After replace: " + sbf);
        sbf.delete(5, 10);
        System.out.println("After delete: " + sbf);
        sbf.reverse();
        System.out.println("After reverse: " + sbf);

        System.out.println("\n---");

     
        StringBuilder sb = new StringBuilder("Python");
        System.out.println("Original StringBuilder: " + sb);
        sb.append(" Coding");
        System.out.println("After append: " + sb);
        sb.insert(7, "Language ");
        System.out.println("After insert: " + sb);
        sb.replace(7, 15, "Core ");
        System.out.println("After replace: " + sb);
        sb.delete(7, 12);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}