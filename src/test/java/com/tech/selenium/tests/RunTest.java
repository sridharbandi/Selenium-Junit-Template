package com.tech.selenium.tests;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sridhar Bandi on 5/9/18.
 */
public class RunTest {

    private WebDriver driver;
    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @Before
    public void setUp(){
        driver = DriverFactory.getBrowser();
        googleSearchPage = new GoogleSearchPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Test
    public void exampleTest(){
        //Write your test here
        googleSearchPage.openURL();
        googleSearchPage.searchFor("Selenium");
        searchResultsPage.assertSeleniumPresent();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
