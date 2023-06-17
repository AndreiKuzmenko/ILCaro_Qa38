import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBse{


        @Test
        public void LoginPositive () {

            String email = "qwe777@gmail.com", password = "123@Qwe123";
            app.getUser(). openLoginForm();
            app.getUser(). fillLoginForm(email, password);
            app.getUser(). submitRegistration();
            app.getUser(). pause(3000);
            Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//button")));
        }

    }
