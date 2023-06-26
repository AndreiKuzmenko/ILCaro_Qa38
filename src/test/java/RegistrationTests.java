import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBse{


    @BeforeMethod
    public void precondition(){
        if(app.getUser().isLogged()) app.getUser().logout();
    }

    @Test
    public void registrationPositive(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        User user = new User()
                .withName("Joe")
                .withLastName("Smith")
                .withEmail("joe_" + i + "@mail.com")
                .withPassword("$Asdf1234");

        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().isLoggedSuccess());

    }
    @Test
    public void registrationNegative(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        User user = new User()
                .withName("Wack")
                .withLastName("Smith")
                .withEmail("wack23@" + i + "@mail.com")
                .withPassword("$Asdf123434");
        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitLogin();
    }
    @Test
    public void registrationNegative2(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        User user = new User()
                .withName("Eva")
                .withLastName("Smith")
                .withEmail("wack23" + i + "@mail.com")
                .withPassword("Asdf123434");
        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitLogin();
    }

    @AfterMethod
    public void postcondition(){
        app.getUser().clickOkButton();
    }
}
