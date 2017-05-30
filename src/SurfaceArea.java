/**
 * Created by joeb6 on 5/28/2017.
 */
import java.util.Scanner;
public class SurfaceArea {
    public static String SurfaceAreaMath(){
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Number of Sides on Prism Base (Enter 0 if Cylinder)");
            double numSides = scan.nextDouble();
            System.out.println("Enter Side Length");
            double side = scan.nextDouble();
            System.out.println("Enter Prism Height");
            double height = scan.nextDouble();

            if (numSides < 1 || side < 0 || height <= 0) {
                System.out.println("Invalid Input(s)");
            } else if (numSides == 0){
                System.out.println("Enter Radius of Cylinder Base");
                double radius = scan.nextDouble();
                double circleArea = Math.PI * (Math.pow(radius,2));

                double finalAREA = circleArea * height;
                return ("Surface Area Equals: " + finalAREA);
            } else {
                double apothem = (side) / (2 * Math.tan(180/numSides));
                double perimeter = side * numSides;
                double baseArea = (apothem * perimeter) / 2;
                double sideArea = side * height;

                double finalAREA = (baseArea * 2) + (numSides * sideArea);
                return ("Surface Area Equals: " + finalAREA);
            }
        }
    }
}
