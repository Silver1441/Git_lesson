package sevice.demo;

import sevice.AdditionalFeature;
import sevice.AdditionalFeatureImpl;
import sevice.DemoService;
import sevice.DemoServiceImplMock;

public class DemoTestImpl implements DemoTest {

    public void makeTest(String arg) {
        DemoService demoService = new DemoServiceImplMock();
        AdditionalFeature additionalFeature = new AdditionalFeatureImpl();

        demoService.makeAction(arg);
        additionalFeature.makeAnAwesomeThing();
    }
}
