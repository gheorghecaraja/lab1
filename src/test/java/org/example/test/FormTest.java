package org.example.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pom.FormPom;
import org.example.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FormTest {

    public static final Logger logger = LogManager.getLogger(FormTest.class);
    static public WebDriver driver;
    static public String URL ="https://demoqa.com/automation-practice-form";
    static public String FIRST_NAME = "Gheorghe";
    static public String LAST_NAME = "Caraja";
    static public String USER_EMAIL = "gheorghecaraja23@gmail.com";
    static public String USER_GENDER = "Male";
    static public String USER_NUMBER = "079762807";
    static public String USER_DATE = "09 August 2006";
    static public String USER_SUBJECT = "English";
    static public String USER_HOBBY = "Music";
    static public String STATE = "Rajasthan";
    static public String CITY = "Jaipur";

    @BeforeClass
    public void beforeTest() {
        logger.info("Start beforeTest");
        driver = Driver.getAutoLocalDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void formTest() {
        logger.info("Start formTest");
        driver.get(URL);
        FormPom form = new FormPom(driver);
        form.closeAdvert();
        form.setFirstName(FIRST_NAME);
        form.setLastName(LAST_NAME);
        form.setUserEmail(USER_EMAIL);
        form.setUserGender(USER_GENDER);
        form.setUserNumber(USER_NUMBER);
        form.setUserDateOfBirth(USER_DATE);
        form.setUserSubject(USER_SUBJECT);
        form.setUserHobbies(USER_HOBBY);
        form.setState(STATE);
        form.setCity(CITY);




        driver.findElement(By.id("submit")).click();
        System.out.println();
        logger.info("Finish beforeTest");
        }


    @AfterClass
    public void afterTest() {
        logger.info("Start afterTest");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("Finish afterTest");
    }
}