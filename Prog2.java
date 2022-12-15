import java.util.Scanner;
import java.lang.Math;

public class Prog2 {
    public static void main(String[] args)
    {
        int a,b,c;
        double s;
        double area;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st side:");
        b = scan.nextInt();


        System.out.println("Enter 2nd side:");
        a = scan.nextInt();


        System.out.println("Enter 3rd side:");
        c = scan.nextInt();

        s = (a+b+c)/2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is " + area);
        scan.close();

    }
}
