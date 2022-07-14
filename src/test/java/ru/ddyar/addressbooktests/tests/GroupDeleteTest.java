package ru.ddyar.addressbooktests.tests;

import org.testng.annotations.Test;
import ru.ddyar.addressbooktests.models.GroupData;

public class GroupDeleteTest extends TestBase {

    @Test
    public void groupDeleteTest() {
        app.getNavigationHelper().gotoGroupsPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getNavigationHelper().gotoGroupsPage();
    }
}
