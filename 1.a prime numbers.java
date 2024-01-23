//Generate prime numbers for the given range
import java.util.Scanner;
class PrimeInRange {
    public static void main(String[] args) 
    {
        int min,max,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minimum value:");
        min=sc.nextInt();
        System.out.println("Enter the maximum value:");
        max=sc.nextInt();
        for(int n=min;n<=max;n++)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                
                System.out.println(n+" ");
            }
            flag=0;
        }
    }
}

