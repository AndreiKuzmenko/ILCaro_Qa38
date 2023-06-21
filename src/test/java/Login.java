import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBse{
    @BeforeMethod
    public void precondition(){
        if(app.getUser().isLogged()){
            app.getUser().logout();
        }

    }


        @Test
        public void LoginPositive () {

            String email = "qwe777@gmail.com", password = "123@Qwe123";
            app.getUser(). openLoginForm();
            app.getUser(). fillLoginForm(email, password);
            app.getUser(). submitLogin();
            app.getUser(). pause(3000);
            Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//button")));
        }    @Test
        public void LoginPositiveUser () {
//User user = new User("qwe777@gmail.com","123@Qwe123");
        User user = new User()
                .withEmail("qwe777@gmail.com")
                .withPassword("123@Qwe123")
                ;
     //   user.setEmail("qwe777@gmail.com");
      //   user.setPassword("123@Qwe123");

            app.getUser(). openLoginForm();
            app.getUser(). fillLoginForm(user.getEmail(), user.getPassword());
            app.getUser(). submitLogin();
            app.getUser(). pause(3000);
            Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//button")));
        }
 @Test
        public void LoginPositiveUserData () {

        User user = new User()
                .withEmail("qwe777@gmail.com")
                .withPassword("123@Qwe123")
                ;
            app.getUser(). openLoginForm();
            app.getUser(). fillLoginForm(user);
            app.getUser(). submitLogin();
     app.getUser(). pause(3000);
     Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//button")));
        }
        @AfterMethod
    public void postcondition(){

        }


    }
