package ru.yandex.praktikum;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private Account account;
    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Before
    public void setUp(){
        account = new Account(name);
    }

    @Parameterized.Parameters(name = "{index} -> {0}: {1} ")
    public static Object[][] dataForTest() {
        return new Object[][] {
                {"Тимоти Шаламе", true},            // позитивный
                {"Maximum Characters!", true},      // 19 символов
                {"Ф О", true},                      // 3 символа с пробелом
                {null, false},                      // null
                {"", false},                        // пустая строка
                {"ТимотейШевроле", false},          // без пробела
                {"Тимотей  Шевроле", false},        // 2 пробела
                {"ФиО", false},                     // 3 символа
                {"ФО", false},                      // меньше 3х символов
                {"Maximum Characters!х", false},    // 20 символов
                {"Тимоти Шевроле Три", false},      // 18 символов с 2 пробелами
                {" Тимотей Шевроле", false},        // пробел в начале
                {"Тимотей Шевроле ", false},        // пробел в конце
                {"   ", false},                     // 3 пробела
        };
    }

    @Test
    @DisplayName("Тест с параметризацией")
    @Description("Проверка метода checkNameToEmboss, варианты ввода данных, метод возвращает true or false")
    public void testParameterized() {
        assertEquals(expected, account.checkNameToEmboss());
    }
}
