import manager.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

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

    @BeforeMethod
    public void startLogger (Method method) {
        logger.info("Method " + method.getName() + " is started");

    }
    @AfterMethod
    public  void end(){
        logger.info("================================================================");

    }
}
