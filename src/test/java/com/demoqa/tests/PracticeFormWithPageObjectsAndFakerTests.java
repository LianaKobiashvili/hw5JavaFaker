package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.PracticeFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PracticeFormWithPageObjectsAndFakerTests extends TestData{

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillFormTest() {
        practiceFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(phone)
                .setBirthDate(day, month, year)
                .setSubjects(subject)
                .setHobbies(hobby)
                .setPicture(pic)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .clickSubmit();

       practiceFormPage.checkResultsTableVisible()
               .checkResult("Student Name", firstName + " " + lastName)
               .checkResult("Student Email",email)
               .checkResult("Gender",gender)
               .checkResult("Mobile",phone)
               .checkResult("Date of Birth",date)
               .checkResult("Subjects",subject)
               .checkResult("Hobbies",hobby)
               .checkResult("Address",currentAddress)
               .checkResult("State and City",state + " " + city)
               .checkResult("Picture", pic);
    }
        }
