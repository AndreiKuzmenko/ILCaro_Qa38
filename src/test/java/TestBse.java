import manager.Application;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBse {
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
