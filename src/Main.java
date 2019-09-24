import sevice.demo.DemoTest;
import sevice.demo.DemoTestImpl;

public class Main {

    public static void main(String[] args) {
        String arg = "New test Action";

        DemoTest demo = new DemoTestImpl();

        demo.makeTest(arg);
    }
}
