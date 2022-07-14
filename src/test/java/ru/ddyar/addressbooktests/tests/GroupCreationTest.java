package ru.ddyar.addressbooktests.tests;

import org.testng.annotations.Test;
import ru.ddyar.addressbooktests.models.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().gotoGroupsPage();
        app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    }

}
