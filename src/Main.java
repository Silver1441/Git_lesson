import sevice.DemoService;
import sevice.DemoServiceImpl;

public class Main {

    public static void main(String[] args) {
        String arg = "Test Action";
        DemoService demoService = new DemoServiceImpl();

        demoService.makeAction(arg);
    }
}
