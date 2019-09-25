import sevice.demo.DemoTest;
import sevice.demo.DemoTestImpl;
import sevice.entity.StringArg;

public class Main {

    public static void main(String[] args) {
        System.out.println("LOG: test start");
        StringArg arg = new StringArg("tested feature");

        DemoTest demo = new DemoTestImpl();

        demo.makeTest(arg.getArg());
        System.out.println("LOG: test end");
    }
}
