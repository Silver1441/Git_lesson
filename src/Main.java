import sevice.demo.DemoTest;
import sevice.demo.DemoTestImpl;

public class Main {

    public static void main(String[] args) {
        String arg = "Test Action";
        String newArg = "Testing new args";

        DemoTest demo = new DemoTestImpl();

        demo.makeTest(arg);
        demo.makeTest(newArg);
    }
}
