public class StringBufferTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("abc");
        builder.append("def");

        for(int i = 1; i <= 5; i++) {
            builder.append("\n");
            builder.append(i);
        }
        System.out.println(builder.toString());
    }
}
