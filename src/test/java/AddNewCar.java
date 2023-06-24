import models.Car;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCar  extends TestBse{
    @BeforeMethod
    public void precondition(){

        if (app.getUser().isLogged() == false)app.getUser().
                login(new User().withEmail("qwe777@gmail.com").withPassword("123@Qwe123"));

        }
        @Test
        public void addNewCarPositive(){
            int i = (int)(System.currentTimeMillis()/1000)%3600;
            Car car = Car.builder()
                    .location("Tel Aviv")
                    .make("Toyota")
                    .model("Corolla")
                    .year("2020")
                    .fuel("Petrol")
                    .seats("4")
                    .carClass("B")
                    .carRegNumber("1223-456-" + i)
                    .price("1000000")
                    .about("This is a")
                    .build();
            app.getCar().openCarForm();
            app.getCar().fillCarForm(car);
            app.getUser().submitLogin();

        }
    }

