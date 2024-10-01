import java.util.Scanner;

public class PemilihanHariDenganIf19 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String dayAngka, dayType;

        System.out.print("Input day angka: ");
        dayAngka = sc.nextLine();

            switch (dayAngka.toLowerCase()) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                    dayType = "weekday";
                    break;
                case "6":
                case "7":
                    dayType = "weekend";
                    break;
                default:
                    dayType = "invalid day angka";
            }

            System.out.println(dayAngka + " is a " + dayType);
    }
}
