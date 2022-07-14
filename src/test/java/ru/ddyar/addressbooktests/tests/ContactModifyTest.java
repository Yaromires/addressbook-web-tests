package ru.ddyar.addressbooktests.tests;

import org.testng.annotations.Test;
import ru.ddyar.addressbooktests.models.ContactData;

public class ContactModifyTest extends TestBase {

    @Test
    public void contactModifyTest() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "12341234", "test3"), false);
        app.getContactHelper().submitContactModification();
    }
}
