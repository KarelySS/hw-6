public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int y = 10; y >= 1; y--) {
            System.out.println("Итерация цикла " + y);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int x = 0; x <= 17; x = x + 2) {
            System.out.println("Итерация цикла " + x);
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int z = 10; z >= -10; z--) {
            System.out.println("Итерация цикла " + z);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int r = 1904; r <= 2096; r = r + 4) {
            System.out.println(r + " год является високосным");
        }
        //Задача 6
        System.out.println("Задача 6");
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println("Итерация цикла " + e);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }
        //Задача 8
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i=1; i<=12; i++) {
            total=total+salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        //Задача 9
        System.out.println("Задача 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i=1; i<=12; i++) {
            total1=total1+total1/100;
            total1 = total1 +salary1;
                     System.out.println("Месяц " + i + " Итого " + total1);
        }
        //Задача 10
        System.out.println("Задача 10");
        for (int i=1; i<=10; i++) {
            System.out.println("2*"+i+"="+2*i);
        }
    }
}