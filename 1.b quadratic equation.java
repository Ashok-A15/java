Program 1.b : Find all the roots of a quadratic equation
import java.util.*;
 class Roots {
 
    public static void main(String[] args)
    {
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        // enter the values of a, b, c
        System.out.println("Enter the values of a,b and c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        // find the discriminate d (b^2 - 4ac)
        double d = (b * b) - (4 * a * c);
 
        // CASE 1:check if discriminate is equal to 0 
        if (d == 0)
        {
            System.out.println("Roots are real and equal");
            r1=r2=-b/(2*a);
            System.out.println("R1="+r1);
            System.out.println("R2="+r2);
        }
        // CASE 2:check if discriminate is greater than 0
        else if (d > 0) 
        {
            System.out.println("Roots are real and distinct");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("R1="+r1);
            System.out.println("R2="+r2);
            
        }
 
         //CASE 3: if discriminate is less than zero
        else 
        {
            System.out.println("Roots are distinct and imaginary");
            double x=-b/(2*a);
            double y=Math.sqrt(-d)/(2*a);
            System.out.println("R1="+x+"+i"+y);
            System.out.println("R2="+x+"-i"+y);
            
         }
    }
}
