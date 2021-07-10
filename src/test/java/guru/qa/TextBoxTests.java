package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void setup() {

        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void positiveFillTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Vasiliy");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("vasya@gmail.uk");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("0102030102");
        $(("#dateOfBirthInput")).click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1992");
        $((".react-datepicker__day--021")).click();
        $("#subjectsInput").setValue("QA testing");
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/scale_1200.jpg"));
        $("#subjectsInput").setValue("QA testing").pressEnter();
        $("#currentAddress").setValue("address");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").scrollTo().click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Vasiliy Ivanov"),
                text("vasya@gmail.uk"),
                text("Male"),
                text("0102030102"),
                text("21 August,1992"),
                text("QA testing"),
                text("Sports, Music"),
                text("scale_1200.jpg"),
                text("address"),
                text("NCR Delhi"));

    }
}
