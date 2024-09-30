import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day, month;
        while (true) {
            System.out.print("Please, enter the day of birth: ");
            day = scan.nextInt();

            System.out.print("Please, enter the month of birth: ");
            month = scan.nextInt();

            if ((month == 2 && day >= 1 && day <= 29) ||
                    ((month == 4 || month == 6 || month == 9 || month == 11) && day >= 1 && day <= 30) ||
                    ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day >= 1 && day <= 31)) {
                break;
            } else {
                System.out.println("Invalid date, please try again!");
            }
        }

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            System.out.print("Aquarius (January 20 - February 18)");
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            System.out.print("Pisces (February 19 - March 20)");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.print("Aries (March 21 - April 19)");
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            System.out.print("Taurus (April 20 - May 20)");
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            System.out.print("Gemini (May 21 - June 20)");
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            System.out.print("Cancer (June 21 - July 22)");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.print("Leo (July 23 - August 22)");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.print("Virgo (August 23 - September 22)");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.print("Libra (September 23 - October 22)");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.print("Scorpio (October 23 - November 21)");
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.print("Sagittarius (November 22 - December 21)");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            System.out.print("Capricorn (December 22 - January 19)");
        }
    }
}
