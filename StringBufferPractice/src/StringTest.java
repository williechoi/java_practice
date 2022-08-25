public class StringTest {
    public static void main(String[] args) {

        // This one uses Heap region
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        // This one uses constant pool
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);
    }
}
