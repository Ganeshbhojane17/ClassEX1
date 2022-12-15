import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        double fahren, celcius;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature in Celcius : ");
        celcius = scan.nextDouble();

        fahren = 1.8 * celcius + 32;

        System.out.println(" Temp in Fahrenheit is = " + fahren);

        scan.close();

    }
}