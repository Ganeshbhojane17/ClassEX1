import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args)
    {
        double radius;
        double circumferance;
        double area;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:");
         radius = scan.nextInt();

         circumferance = 2 * 3.142885 * (double)radius;
        area = 3.142885 * (double)radius * (double)radius;

        System.out.println("Circumferance =" + circumferance);
        System.out.println("Area =" + area);

        scan.close();

    }
}
