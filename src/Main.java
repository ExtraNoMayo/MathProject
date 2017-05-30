/**
 * Created by BDOSHNA on 5/24/2017.
 */
import sun.java2d.Surface;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Triangle T;
        Trap Tr;
        Circle C;
        Polygon P;
        SurfaceArea SA;
        Parallelogram PL;
        T = new Triangle();
        Tr = new Trap();
        C = new Circle();
        P = new Polygon();
        SA = new SurfaceArea();
        PL = new Parallelogram();

        System.out.println("Welcome To Area Calculator, Press any Enter to continue");
        scan.nextLine(); //just delaying the while loop

        while (true){ //infinite loop that will break when exit is typed
            System.out.println("For Area of Triangle Enter 1");
            System.out.println("For Area of Parallelogram Enter 2");
            System.out.println("For Area of a Regular Polygon with more than 4 sides Enter 3");
            System.out.println("For Area of Trapezoid Enter 4");
            System.out.println("For Area of Circle Enter 5");
            System.out.println("For Surface Area of Prism or Cylinder Enter 6");
            System.out.println("To Exit Enter 'Exit'");
            String Num = scan.nextLine();
            if (Num.equalsIgnoreCase("Exit")){
                System.out.println("Goodbye");
                break;
            }
            int Choice = Integer.parseInt(Num);
            switch (Choice){
                case 1: System.out.println(T.TriangleMath());
                    break;
                case 2: System.out.println(PL.ParallelogramMath());
                    break;
                case 3: System.out.println(P.PolygonMath());
                    break;
                case 4: System.out.println(Tr.TrapMath());
                    break;
                case 5: System.out.println(C.CircleMath());
                    break;
                case 6: System.out.println(SA.SurfaceAreaMath());
                    break;
            }
            System.out.println("    "); //blank space line
            System.out.println("Hit enter to Continue");
            String temp2 = scan.nextLine();//delay again
            System.out.println("_______________________________"); //line in between loops

        }
    }
}

