import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (!(monthNumber > 12)) { // Инвертируйте условие
                break;
            } else {
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
            }
        }
        String season = "";
        // Допишите условия ветвления в виде утверждений
        if (monthNumber==12 || monthNumber==1 || monthNumber==2) {
            season = "Зима";
        } else if (monthNumber==3 || monthNumber==4 || monthNumber==5) {
            season = "Весна";
        } else if (monthNumber==6 || monthNumber==7 || monthNumber==8) {
            season = "Лето";
        } else if (monthNumber==9 || monthNumber==10 || monthNumber==11) {
            season = "Осень";
        } else {
            season = "Зима";
        }
        if (season.equals("Лето")) {
            System.out.println("Летом лучше остаться в Москве.");
            //break;
        } /* Допишите ветвление, которое будет печатать строку:
            System.out.println("Летом лучше остаться в Москве.");
              и завершать выполнение программы */

        else {
            System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
            int ticketMoscowParis = scanner.nextInt();
            System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
            int ticketMoscowLondonParis = scanner.nextInt();
            System.out.println("У вас есть британская виза?");
            System.out.println("1 - да, виза есть");
            System.out.println("0 - визы нет");
            int britainVisa = scanner.nextInt();


            // В этом ветвлении что-то напутано с условиями - исправьте это
            //if (!season.equals("Лето")) { // Перенесите проверку на "Лето" выше
            if ((ticketMoscowLondonParis < ticketMoscowParis)) {
                if (britainVisa != 0) { // Упростите это условие
                    System.out.println("Летим через Лондон!");
                } else {
                    System.out.println("Летим напрямую в Париж!");
                }
            } else {
                System.out.println("Летим напрямую в Париж!");
            }
            // }


        }
    }
}