import sevice.DemoService;
import sevice.DemoServiceImpl;
import sevice.DemoServiceImplMock;

public class Main {

    public static void main(String[] args) {
        String arg = "Test Action";
        DemoService demoService = new DemoServiceImplMock();

        demoService.makeAction(arg);
    }
}
