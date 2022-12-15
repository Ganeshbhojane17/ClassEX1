import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {

        double length, width, height, area, paintArea, notPaintArea, requirePaint;
        int window, door;
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the length of the room: ");
        length = scan.nextDouble();

        System.out.println(" Enter the width of the room: ");
        width = scan.nextDouble();

        System.out.println(" Enter the height of the room: ");
        height = scan.nextDouble();

        area = length * width * height;
        System.out.println(" Area of the room is: " + area);

        System.out.println("Enter the no of doors: ");
        door = scan.nextInt();

        System.out.println("Enter the no of windows: ");
        window = scan.nextInt();

        notPaintArea = (door * 20) * (window * 15);

        paintArea = area - notPaintArea;

        System.out.println( "Area need to do paint = " + paintArea + "Sqft");

        requirePaint = paintArea/350;

        System.out.println(" Required paint = " + requirePaint + " Gallons");

        scan.close();


    }


}
