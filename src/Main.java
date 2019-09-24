import sevice.*;

public class Main {

    public static void main(String[] args) {
        String arg = "Test Action";
        DemoService demoService = new DemoServiceImplMock();
        AdditionalFeature additionalFeature = new AdditionalFeatureImpl();

        demoService.makeAction(arg);
        additionalFeature.makeAnAwesomeThing();
    }
}
