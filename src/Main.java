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
    }
}

