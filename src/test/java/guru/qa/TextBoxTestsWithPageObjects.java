package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class TextBoxTestsWithPageObjects {

    RegistrationPage registrationPage = new RegistrationPage();

    String firstName = "Vasiliy ";
    String lastName = "Ivanov ";

    @BeforeAll
    static void setup() {

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTest() {
        registrationPage.openPage();

        registrationPage.typeFirstName("Vasiliy");
        registrationPage.typeLastName("Ivanov");
        registrationPage.typeEmail("vasya@gmail.uk");
        registrationPage.selectGender("Other");
        registrationPage.typePhone("0321032105");
        registrationPage.setDate("21", "August", "1992");
        registrationPage.typeSubjects("Math");
        registrationPage.typeHobbies("Sports");
        registrationPage.uploudFile("./img/1.png");
        registrationPage.typeAdress("ulica lenina");
        registrationPage.selectState("NCR");
        registrationPage.selectCity("Delhi");
        registrationPage.selectCity("Delhi");
        registrationPage.clickButton(); // TODO: 17.08.2021

        registrationPage.checkResultsTitle();
        registrationPage.checkResultsValue(firstName + lastName);
        registrationPage.checkResultsValue("vasya@gmail.uk");
        registrationPage.checkResultsValue("Other");
        registrationPage.checkResultsValue("0321032105");
        registrationPage.checkResultsValue("21" + "August" + "1992");
        registrationPage.checkResultsValue("Math");
        registrationPage.checkResultsValue("Sports");
        registrationPage.checkResultsValue("./img/1.png");
        registrationPage.checkResultsValue("ulica lenina");
        registrationPage.checkResultsValue("NCR" + " " + "Delhi");


    }
}

