
public class Main {

    public static void main(String[] args) {
        MyDate myDate = new MyDate(29, 12, 2011);
        myDate.advance();
        myDate.advance();
        System.out.println(myDate);
    }
}
