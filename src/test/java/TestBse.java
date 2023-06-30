import manager.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBse {
    Logger logger = LoggerFactory.getLogger(TestBse.class);
    static Application app = new Application();
    @BeforeSuite
    public void setUp(){
        app.init();

    }

    @AfterSuite
    public void stop(){
        app.tearDown();
    }
}
