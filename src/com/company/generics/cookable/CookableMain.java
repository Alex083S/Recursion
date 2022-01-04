package com.company.generics.cookable;

public class CookableMain {
    public static void main(String[] args) {
        Food f1 = new Food();
        Cookable c1 = new Cookable() {  //Объект типа "Интерфейс" с анонимным классом, реализующим интерфейс
            @Override
            public void cook(String str) {
                System.out.println("Готовим по рецепту: " + str);
            }
        };
        f1.prepare(c1, "Каша");
    }
}
