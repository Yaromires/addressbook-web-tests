package ru.ddyar.addressbooktests.tests;

import org.testng.annotations.Test;
import ru.ddyar.addressbooktests.models.ContactData;

public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreationTest() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "12341234", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage();

    }
}
