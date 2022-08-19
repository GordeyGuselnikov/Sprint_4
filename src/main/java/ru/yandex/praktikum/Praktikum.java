package ru.yandex.praktikum;

import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {

        System.out.println("Введите Имя и Фамилию через пробел");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println("Фамилию и Имя: '" + name + "' можно использовать для печати на банковской карте.");
        } else {
            System.out.println("Фамилию и Имя: '" + name + "' нельзя использовать для печати на банковской карте!");
        }
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }
}
