import sevice.demo.DemoTest;
import sevice.demo.DemoTestImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("LOG: start");
        String arg = "New test Action";
        String newArg = "Testing new args";

<<<<<<< HEAD
        DemoTest demo = new DemoTestImpl();

        demo.makeTest(arg);
        demo.makeTest(newArg);
=======
        demoService.makeAction(arg);
        System.out.println("LOG: test end");
>>>>>>> eb94782... LOG end is added
    }
}
