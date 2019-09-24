import sevice.demo.DemoTest;
import sevice.demo.DemoTestImpl;

public class Main {

    public static void main(String[] args) {
        String arg = "Test Action in dev branch";

        DemoTest demo = new DemoTestImpl();

        demo.makeTest(arg);
    }
}
