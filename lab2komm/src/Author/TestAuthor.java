package Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Liza", "l.komendan4enko@yandex.ua", 'W');
        System.out.println(a1);
        a1.setEmail("l.komendan4enko@yandex.ua");
        System.out.println(a1);
    }
}
