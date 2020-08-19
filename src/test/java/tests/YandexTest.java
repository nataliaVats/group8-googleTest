package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void searchYandex() {
        // Открыть Yandex
        open("https://yandex.com");

        // Ввести Gradle в поиск
        $(byId("text")).setValue("gradle").pressEnter();

        // Проверить, что Gradle появился в результатах поиска
        $("html").shouldHave(text("Gradle"));
    }
}
