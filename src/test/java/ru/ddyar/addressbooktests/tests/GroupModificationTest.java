package ru.ddyar.addressbooktests.tests;

import org.testng.annotations.Test;
import ru.ddyar.addressbooktests.models.GroupData;

public class GroupModificationTest extends TestBase {

    @Test
    public void groupModificationTest() {
        app.getNavigationHelper().gotoGroupsPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().gotoGroupsPage();
    }
}
