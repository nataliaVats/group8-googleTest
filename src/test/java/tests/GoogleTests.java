package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class GoogleTests {
    @Test
    void selenideSearchTest() {
        open("https://google.com");

        $(byName("q")).val("Selenide").pressEnter(); // Ввести Selenide в поиск

        $("div#center_col").shouldHave(text("selenide.org")); // Selenide появился в результатах поиска
    }
}
