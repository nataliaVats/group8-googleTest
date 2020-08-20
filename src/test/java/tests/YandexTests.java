package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class YandexTests {
    @Test
    void selenideSearchTest() {
        open("https://yandex.com/");

        $("#text").val("Selenide").pressEnter(); // Ввести "Selenide" в поиск

        $("div.main__center").shouldHave(text("selenide.org")); // "selenide.org" появился в результатах поиска
    }
}