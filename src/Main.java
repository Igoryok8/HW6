public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }else {
        if (clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        }
        System.out.println("Задание 3");
        int year = 400;
        if (year % 4==0 && year%100 != 0 || year%400 == 0) {
            System.out.println(year+ " год высокосный");

        }else {
            System.out.println(year+ " год не высокосный");

        }
        System.out.println("Задание 4");
        int deliveryDistance = 17;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        }else if (deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        }else{
            System.out.println("Потребуется 3 дня");
        }
        System.out.println("Задание 5");
int monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
                default:
                System.out.println("Такого месяца не существует");
        }
    }

}

