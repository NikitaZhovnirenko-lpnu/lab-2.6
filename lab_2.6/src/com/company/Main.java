package com.company;

import Strings.Genders;

public class Main {

    public static void main(String[] args) {

      /*
        Створити клас Man (людина) з полями: ім’я, вік, стать і вага. Визначити методи
        переприсвоєння імені, зміни віку і зміни ваги.
        Створити клас-контейнер Student, що має поля «людина» та «рік навчання».
        Визначити методи переприсвоєння та збільшення року навчання.


        Виконати завдання свого варіанту Лабораторної роботи № 1.6 (Вкладені класи) з
        конструкторами і перевантаженням операцій (тобто, Лабораторної роботи № 2.5),
        використовуючи конструкцію вкладеного класу замість композиції.

        */

        Student.Man stephan = new Student.Man("Степан", Genders.GENDER_MALE, 15, 52.5);
        Student.Man maria = new Student.Man("Марія", Genders.GENDER_FEMALE, 16, 57.0);

        Student.Man empty = new Student.Man();
        Student.Man copied = new Student.Man(stephan);

        Student student1 = new Student(9, stephan);
        Student student2 = new Student(10, maria);

        System.out.println(maria.toString());
        System.out.println(empty.toString());
        System.out.println(copied.toString());
        System.out.println(student1.toString());


    }
}
