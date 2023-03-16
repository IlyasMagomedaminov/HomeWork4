public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1:");
        byte clientOS = 1;

        switch (clientOS){
            case 0:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            default:
                System.out.println("Приложение не работает.");
        }

    }
    public static void task2(){
        System.out.println("Задача 2:");

        int clientDeviceYear = 2013;
        byte clientOS = 1;

        if (clientDeviceYear < 2015){
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }else if(clientOS ==1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }else {
            if (clientOS ==0){
                System.out.println("Установите версию приложения для iOS.");
            }else if (clientOS == 1){
                System.out.println("Установите версию приложения для Android.");
            }
        }

    }
    public static void task3(){
        System.out.println("Задача 3:");

        int year = 2460;

        if ((year % 4) == 0 || (year % 400) == 0){
            System.out.println(year + " год является високосным");
        }else if ((year % 100) == 0 || (year % 4) != 0){
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задача 4:");

        byte deliveryDistance = 95;

       if (deliveryDistance <= 20){
           System.out.println("Потребуется дней: " + 1);
       } else if (deliveryDistance <= 60) {
           System.out.println("Потребуется дней: " + 2);
       } else if (deliveryDistance <= 100) {
           System.out.println("Потребуется дней: " + 3);
       }else {
           System.out.println("Доставки нет.");
       }
    }
    public static void task5(){
        System.out.println("Задача 5:");

        byte monthNumber = 5;

        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не сушествует.");

        }
    }
}