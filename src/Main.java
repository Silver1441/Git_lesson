import sevice.demo.DemoTest;
import sevice.demo.DemoTestImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("LOG: test start");
        String arg = "New test Action";
        String newArg = "Testing new args";

        DemoTest demo = new DemoTestImpl();

        demo.makeTest(arg);
        demo.makeTest(newArg);
        System.out.println("LOG: end");
        System.out.println("LOG: test end");
    }
}
