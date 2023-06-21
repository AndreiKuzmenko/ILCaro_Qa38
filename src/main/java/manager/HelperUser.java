package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm(){
        wd.findElement(By.xpath("//a[text()=' Log in ']")).click();
    }

    public void fillLoginForm(String email, String password){
        type(By.xpath("//input[@id='email']"), email);
        type(By.id("password"), password);
    }
    public void fillLoginForm(User user){
        type(By.xpath("//input[@id='email']"), user.getEmail());
        type(By.id("password"), user.getPassword());
    }

    public void submitRegistration(){
        click(By.xpath("//button[@type='submit']"));
    }
    public void submitLogin(){

       wd.findElement(By.xpath("//button[@type='submit']"));
    }

    public void logout(){
        click(By.xpath("//*[.='Sign Out']"));
    }
    public boolean isLogged (){
        return   isElementPresent(By.xpath("//*[.='Sign Out']"));
    }


}