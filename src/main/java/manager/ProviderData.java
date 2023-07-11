package manager;

import models.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProviderData {

    @DataProvider
    public Iterator<Object[]> userDto(){

        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{new User()
                .withEmail("qwe777@gmail.com")
                .withPassword("123@Qwe123")
        });
        list.add(new Object[]{new User()
                .withEmail("qwe777@gmail.com")
                .withPassword("123@Qwe123")
        });
        list.add(new Object[]{new User()
                .withEmail("qwe777@gmail.com")
                .withPassword("123@Qwe123")
        });
        return list.iterator();
    }
}
