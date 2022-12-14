package com.cyde.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    /*
    Method #1 info:
• Name: returnOrderDate ()
• Return type: String
• Arg1: WebDriver driver
• Arg2: String costumerName
This method should accept a costumerName and return the costumer order date
as a String.
     */

    public static String returnOrderDate(WebDriver driver, String costumerName) {
        String locator = "//td[text()='" + costumerName + "']/following-sibling::td[3]";
        WebElement costumerOrderDate = driver.findElement(By.xpath(locator));

        return costumerOrderDate.getText();
    }

    /*Method #2 info:
• Name: orderVerify ()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String costumerName
• Arg3: String expectedOrderDate
This method should accept above mentioned arguments and internally assert
expectedOrderDate matching actualOrderDate.
*/
    public static void orderVerify (WebDriver driver, String costumerName, String expectedOrderDate){
        WebElement costumerOrderDate = driver.findElement(By.xpath("//td[text()='" + costumerName + "']/following-sibling::td[3]"));
        String actualOrderDate = costumerOrderDate.getText();

        Assert.assertEquals(actualOrderDate, expectedOrderDate);

    }
}
