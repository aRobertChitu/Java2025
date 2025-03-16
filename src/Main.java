import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Test test1 =  new Test(5, "test");
        Test test2 = new Test(6);
        Test test3 = new Test("TEST");

        System.out.println(test1);
//        System.out.println(test2);
//        System.out.println(test3);

        System.out.println(test1.getY());
        test1.setX(90);
        test1.setY("DA");

        System.out.println(test1.getY());
        System.out.println(test1);

    }
}

