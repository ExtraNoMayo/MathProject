/**
 * Created by BDOSHNA on 5/24/2017.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Triangle T;
        T = new Triangle();
        System.out.println("Welcome To Area Calculator, Press any Enter to continue");
        String temp = scan.nextLine(); //just delaying the while loop

        while (true){ //infinite loop that will break when exit is typed
            System.out.println("For Area of Triangle Enter 1");
            System.out.println("For Area of Parallelogram Enter 2");
            System.out.println("For Area of a Regular Polygon with more than 4 sides Enter 3");
            System.out.println("For Area of Trapezoid Enter 4");
            System.out.println("For Area of Circle Enter 5");
            System.out.println("For Surface Area of Prism Enter 6");
            String Num = scan.nextLine();
            if (Num.equalsIgnoreCase("Exit")){
                System.out.println("Goodbye");
                break;
            }
            int Choice = Integer.parseInt(Num);
            switch (Choice){
                case 1: System.out.println(T.TriangleMath());

                    break;
                case 2: //Parallelogram();
                    break;
                case 3: //Polygon();
                    break;
                case 4: //Trap();
                    break;
                case 5: //Circle();
                    break;
                case 6: //SurfaceArea();
                    break;
            }
            System.out.println("    "); //blank space line
            System.out.println("Hit enter to Continue");
            String temp2 = scan.nextLine();//delay again
            System.out.println("_______________________________"); //line in between loops

        }
    }
}

