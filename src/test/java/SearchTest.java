import org.testng.annotations.Test;

public class SearchTest extends TestBse{

    @Test
    public void searchPositiveTest(){
        app.getSearch().fillSearchForm("Haifa", "07/20/2023", "09/19/2023");
        app.getSearch().pause(1000);
        app.getSearch().submitForm();
    }


}
