package com.cyde.test.day9_proporties_configuration_reader;

import com.cyde.test.base.TestBase;
import com.cyde.utilities.BrowserUtils;
import com.cyde.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBase {


    @Test
    public void crm_login_test(){

        // 2. Go to : http://login1.nextbasecrm.com/

        driver.get("http://login1.nextbasecrm.com/");

//        3. Enter valid username

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("hr2@cydeo.com");
//        4. Enter valid password

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

//        5. Click to Log In button

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

//        6. Verify title is as expected: Expected: Portal
       // Assert.assertEquals(driver.getTitle(), "Portal");
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test2(){

        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.login_crm(driver);

        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test3(){

        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.login_crm(driver, "hr3@cydeo.com", "UserUser");

        BrowserUtils.sleep(5);

        BrowserUtils.verifyTitle(driver,"Portal");

    }
}
