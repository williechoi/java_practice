public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("데미안", "헤르만 헤세");
        Book book2 = new Book("홍길동전", "허균");
        Book book3 = new Book("보바리부인", "장 칼뱅");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        String str = new String("test");
        System.out.println(str);
    }
}
