package com.tech.selenium.tests;

import com.tech.selenium.driverutil.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sridhar Bandi on 5/9/18.
 */
public class RunTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = DriverFactory.getBrowser();
    }

    @Test
    public void exampleTest(){
        //Write your test here
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
