package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

       // throw new Exception("Какое-то исключение");

        File file = new File("C:/123/354.txt");
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            // побайтово
            // классы
            // FileInputStream & FileOutputStream

            // чтение и запись
            // Scanner & BufferedReader
            // PrintWriter

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("Hello!");
            printWriter.close();

            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            scanner.close();

            // Scanner.nextLine(); - вся строка



        } catch (IOException e) {
            e.printStackTrace();
        }



/*
        Figure triangle = new Figure(3);
        try {
            triangle.setCoord(0,2,3);
            triangle.setCoord(1,5,6);
            triangle.setCoord(2,5,90);
            triangle.setCoord(3,5,87);
        } catch (PointIndexException e) {
          //  e.printStackTrace();
            System.out.println("Ошибка: " + e.getMessage());
        }









        try {
            int a = 0;
            int b = 100;
            int c = b / a;
            int x[] = new int[5];
            x[10] = 9;
            System.out.println("After exception!");
           // ArrayIndexOutOfBoundsException
        //ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e ) {
            System.out.println("Exception: "+ e.toString());
        } finally {
            // закрытие соедения, закрытие файла
            System.out.println("Finally!!!");
        }













       // User ivan = new User();
        User ivan = new Student("Ivan",30);

        Post post = new Post();
        Post.Letter letter = post.new Letter("Moscow");
        letter.sendLetter();

        class Car {
            private String name;
            Car(String n) {
                this.name = n;
            }
        }

        Car bmw = new Car("BMW");

        // в случае, если интерфейс функциональный - 1 метод
        Learnable learn = () -> System.out.println("Learn!");

*/
    }

}

class Post {
    private int number;
    class Letter {
        private String address;
        Letter(String a) {
            this.address = a;
        }
        public void sendLetter() {
            System.out.println("Sending...");
        }
    }

}
