package com.demoqa.tests;

import com.demoqa.utils.RandomUtils;
import com.github.javafaker.Faker;

public class TestData {
     //static String firstName = "Petr",
//             lastName = "Kukushkin",
//             email = "kuku@gmail.com",
//             day = "31",
//             month = "July",
//             year = "1992",
//             phone = "8999333224";
     static Faker faker = new Faker();

     public static String firstName = faker.name().firstName(),
             lastName = faker.name().lastName(),
             email = faker.internet().emailAddress(),
             currentAddress = faker.address().fullAddress(),
             phone = faker.phoneNumber().subscriberNumber(10),
             gender = faker.demographic().sex(),
             pic = "kot.jpg",
             hobby = "Reading",
             subject = "Chemistry",
             //path = "src/test/resources/kot.jpg",
             state = "Haryana",
             city = "Karnal",
             day = String.valueOf(faker.number().numberBetween(1, 31)),
             month = String.valueOf(RandomUtils.RandomMonth.getRandomMonth()),
             year = String.valueOf(faker.number().numberBetween(1920, 2003)),
             date = day + " " + month + "," + year;
}
