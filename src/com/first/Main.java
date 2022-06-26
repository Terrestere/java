package com.first;


import com.first.db.DB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();

        bmw.setLight(true);
        bmw.blinkLight();

    }

}
        //ООП классы и объекты
//        final int count = 10;
//
//        Person obj1 = new Person();
//        Person obj2 = new Person();
//        Person.getCount();
//        Person obj3 = new Person();
//        Person.getCount();
//        Person obj4 = new Person();
//        Person.getCount();
////        Person.count = 5;
////        System.out.println(Person.count);
//
//        DB db = new DB(); //Класс из другого пакета
//
////        info();
//    }
//
//    public static void info() {
//        System.out.println("Hello");
//    }
//    public static void info(String word) {
//        System.out.println(word + "!");
//    }
//
//}


//        Car bmw = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0});
//        bmw.engine.setValues(false, 2000);
//        bmw.engine.info();
//
//        Truck truck = new Truck(5600, new byte[]{100, 0, 100});
//        truck.engine.setValues(true, 500);
//        truck.engine.info();

//        truck.setValues(250.5f, 2500, "White", new byte[]{0, 0, 0}, true);
//        System.out.println(truck.getValues());

//        Car flyCar = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0}) {
//            @Override
//            public void moveObject(float speed) {
//                super.moveObject(speed);
//
//                this.engine.isReady(true);
//                System.out.println("Машина летит");
//            }
//        };
//        flyCar.moveObject(450);
//
//    }
//}

/*
        //Методы в Java
        byte[] nums1 = new byte[] {5, 6, 8};

        int summ1 = summaArray(nums1);
        System.out.println("СУмма 1: " + summ1);

        byte[] nums2 = new byte[]{5, 6, 5, 7, 8};

        int summ2 = summaArray(nums2);
        System.out.println("СУмма 2: " + summ2);
    }

    public static int summaArray(byte[] arr){
        int summa = 0;
        for(byte i = 0; i < arr.length; i++){
            summa += arr[i];
        }
        return summa;
    }
}
*/


 /*       //Функции по факту методы
//        info("Hello");
//        String java = "Java";
//        info(java);
//        info("");

        short num = 7;
        int result1 =summa((short)5, num);
        short num2 = 8;
        int result2 = summa((short)4, num2);
        info(String.valueOf(result2));
    }

    public static int summa(short a, short b){
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word){
        System.out.print(word);
        System.out.println("!");
    }
}
*/

/*
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(15.6f);
        numbers.add(335.62f);

        for(Float el: numbers)
            System.out.println(el);
    }
}
*/

/*        //Коллекция Java
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

//        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
//        numbers.clear();

        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}*/

 /*       //Многомерный массивы данных
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][]{
                {5, 7},
                {7, 3},
                {2, 0}
        };

        nums[1][1] = 67;
        System.out.println(nums[1][1]);

        for()
            for()
    }
}
*/

/*
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++ ){
            System.out.print("Vvedite chislo: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimal: " + min);
    }
}
*/


/*
        // Массивы данных
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 32;
        nums[2] = 1;
        nums[3] = 9;
        nums[4] = 65;
        int res = nums[2] + nums[3];
        System.out.println(res);


        float[] nums2 = new float[]{5.0f, 6.45f, 89.984f};


        for(int i = 0; i < nums2.length; i++){
            System.out.println("Element: " + nums2[i]);
        }
    }
}
*/


/*
        for (int i = 5; i < 25; i += 2) {
            if(i % 3 == 0)
                continue;

            if(i >= 17)
                break;
            System.out.println("Element: " + i);
        }
    }
}
*/


/*
//Циклы
//        for (float i = 100; i > 10; i /= 2) {
//            System.out.println("Element: " + i);
//        }
//        int i = 100;
//        while(i > 5){
//            System.out.println("Element: " + i);
//            i -=25;
        int i = 0;
        do {
            System.out.println("Element: " + i);
            i++;
        }
        while(i < 10);
    }
}
*/


    /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Ведите 2 число: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Вы что-то не так ввели");
        }
    }
}
*/


/*        //Условные конструкции switch-case
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Num is 1");
                break;
            case 2:
                System.out.println("Num is 2");
                break;
            case 5:
                System.out.println("Num is 5");
                break;
            case 10:
                System.out.println("Num is 10");
                break;
            default:
                System.out.println("Default");
        }
        }
    }
*/



/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        if (role.equals("Admin") && pass.equals("12345")) {
            System.out.print("Все пользователи");
        } else {
            System.out.print("Првиет, как вас зовут?");
            String name = scanner.nextLine();
        }
    }
}
*/


/*
        //Условные конструкции if-else
        int a = 15, b = 10;
        char sym1 = 'A', sym2 = 'A';
        boolean isHasCar = true;
        if(isHasCar && a == b){
            System.out.println("Да, верно");
        }
        else if (a >= b) {
            System.out.println("Second test");
        }
        else{
            System.out.println("Нет, не верно");

        }

    }
}
*/



        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        float num1 = scan.nextFloat();
        System.out.print("Введите 2 число: ");
        float num2 = scan.nextFloat();
        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n");

    }
}
*/


        /*
        Scanner scan = new Scanner(System.in);
        short num1 = 50, num2 = 10;
        int res = num1 + num2;
        System.out.println("Результат: " + res);
        res += 10;
        res ++;
    }
}
*/

        /*       Scanner scan = new Scanner(System.in);
 //       System.out.print("Введите ваше имя: ");
 //      String username = scan.nextLine();
 //       System.out.println("Привет, " + username);
        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();
        float num3 = scan.nextFloat();

    }
}
*/


    /*
    public static void main (String[] args) {
        // Comment

        System.out.println("Hello\tWorld!");
        /*
        Comment
         */
/*
        byte age = 127;
        short num = 128;
        int num2 = 56;
        long num3 = 4567;

        float num4 = 14.345678f;


        char ch = '&';
        String user_name = "Bob";
        System.out.println(user_name);

        boolean isHappy = true;


    }

}
*/