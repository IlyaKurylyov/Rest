package org.example;


public class division {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//ожидание фейла
        try {
          int answer = a/b;
          System.out.println("IT IS IMPOSSIBLE");
          //Перехватываем ошибку
    } catch (Exception e) {
            System.out.println("YOU ARE BROKE");
        }
        //Исполняем в любом случае
        finally {
            int result = a * b;
            System.out.println(result);
        }
    }
}