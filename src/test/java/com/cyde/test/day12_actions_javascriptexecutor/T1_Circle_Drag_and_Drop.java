package com.cyde.test.day12_actions_javascriptexecutor;

import com.cyde.utilities.BrowserUtils;
import com.cyde.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop_test(){

//        1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        BrowserUtils.sleep(2);
        WebElement acceptCookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookies.click();

        // locate both small and big circles
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        // Create Action object
        Actions actions = new Actions(Driver.getDriver());

//        2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle,bigCircle).perform();

        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release()
                .perform();

//        3. Assert: -Text in big circle changed to: “You did great!”

        String actualTextOnBigCircle = bigCircle.getText();
        String expectedTextOnBigCircle = "You did great!";


    }

}
