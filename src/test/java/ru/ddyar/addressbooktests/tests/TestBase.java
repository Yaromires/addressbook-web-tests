package ru.ddyar.addressbooktests.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.ddyar.addressbooktests.appmanager.AppManager;

public class TestBase {

    protected AppManager app = new AppManager(BrowserType.CHROME);

    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }
}
