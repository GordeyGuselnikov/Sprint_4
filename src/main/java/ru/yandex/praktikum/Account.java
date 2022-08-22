package ru.yandex.praktikum;

import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Проверка на соответствие требованиям")
    public boolean checkNameToEmboss() {

        //return name != null && name.matches("(?=.{3,19}$)[a-zA-Zа-яёА-ЯЁ]+\\s[a-zA-Zа-яёА-ЯЁ]+");
        return name != null &&
                name.length() >= 3 &&
                name.length() <= 19 &&
                name.contains(" ") &&
                name.indexOf(" ") == name.lastIndexOf(" ");
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }
}
