/**
 * Created by joeb6 on 5/28/2017.
 */
import java.util.Scanner;
public class Parallelogram {
    public static String ParallelogramMath(){
        Scanner scan = new Scanner(System.in);
        Boolean x = true;

        while(true) {
            System.out.println("To Find Area with Base and Height Enter 1");
            System.out.println("To Find Area with Base, Side, and Angle Enter 2");
            int input = scan.nextInt();

                if (input == 1) {
                    System.out.println("Enter Base");
                    int base = scan.nextInt();
                    System.out.println("Enter Height");
                    int height = scan.nextInt();

                    if (base < 0 || height < 0) {
                        System.out.println("Error: Base and Height cannot be negative");
                    } else {
                        int finalAREA = base * height;
                        return ("Area Equals: " + finalAREA);
                    }

                } else if (input == 2) {
                    System.out.println("Enter Base");
                    int base = scan.nextInt();
                    System.out.println("Enter Side");
                    int side = scan.nextInt();
                    System.out.println("Enter Angle");
                    double angle = Math.toRadians(scan.nextDouble());

                    if (base < 0 || side < 0 || angle < 0) {
                        System.out.println("Error: Base, Side, and Angle cannot be negative");
                    } else {
                        double finalAREA = (base * side * Math.sin(angle));
                        return ("Area Equals: " + finalAREA);
                    }

                } else {
                    System.out.println("Invalid Input");
                }
         }
    }
}
