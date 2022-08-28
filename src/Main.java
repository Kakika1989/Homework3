public class Main {
    public static void main(String[] args) {

// Задание 1-2
        int clientOS = 1;
        int clientDeviceYear = 2012;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченую версию приложения для iOs по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию для iOs по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию для Android по ссылке");
        }

// Задание 3
        int year = 2021;

        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

// Задание 4
        int deliveryDistance = 95;
        int daysDelivery = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + daysDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней " + (daysDelivery + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <=100){
            System.out.println("Потребуется дней " + (daysDelivery + 2));
        } else {
            System.out.println("Доставка в ваш район не осуществляется.");
        }

// Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

//Задание 6
        int age = 19;
        int salary = 58_000;
        if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы дать вам кредитную карту с лимитом " + salary * 3 * 1.2 + " рублей.");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы дать вам кредитную карту с лимитом " + salary * 3 * 1.5 + " рублей.");
        } else if (age < 23 && age >= 18 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы дать вам кредитную карту с лимитом " + salary * 2 * 1.2 + " рублей.");
        } else if (age < 23 && age >= 18 && salary >= 80_000) {
            System.out.println("Мы готовы вам дать кредитную карту с лимитом " + salary * 2 * 1.5 + " рублей.");
        } else if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей.");
        } else if (age < 23 && age >= 18 && salary < 50_000) {
            System.out.println("Мы готовы дать вам кредитную карту с лимитом " + salary * 2 + " рублей.");
        } else if (age < 18) {
            System.out.println("Вам еще рано иметь кредитную карту.");
        }

//Задание 7
        int age7 = 25;
        int salary7 = 100_000;
        int wantedSum = 330_000;



    }
}