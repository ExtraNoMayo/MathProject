/**
 * Created by joeb6 on 5/28/2017.
 */
import java.util.Scanner;
public class Circle {
    public static String CircleMath(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        double radius = scan.nextDouble();
        if (radius < 0) {
            return("Error: Invalid Radius Length");
        }

        double AREA = (Math.PI * Math.pow(radius,2));
        String finalAREA = String.valueOf(AREA);
        return("Area Equals: " +finalAREA);//edit this when done
    }
}
