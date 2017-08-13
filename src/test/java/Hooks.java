import com.openDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.sql.Driver;

/**
 * Created by toastemaster on 7/29/2017.
 */
public class Hooks {

    openDriver openD = new openDriver();

    @Before
    public void openBrowser() throws IOException {
        //Open a browser

        openD.browser();
    }

//    @After
//   public void quitBrowser() {
//
//        openD.quitBrowser();
//    }


}
