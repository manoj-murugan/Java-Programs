import java.util.Scanner;
public class odd_even_pos_diff 
{
        public static void main(String args[])
        {
            int input, digit, sum1, sum2, count = 1, diff;
            sum1 = 0; sum2 = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the input : ");
            input = sc.nextInt();
            while(input > 0)
            {
                digit = input % 10; 
                if(count%2!=0)
                 sum1 = sum1 + digit;
                else 
                 sum2 = sum2 + digit;
                count++;
                input = input/10;             
            }
            diff = sum1 - sum2;
            if(diff<0)
             diff = diff * (-1);
            System.out.println("The Difference is : " +diff);
        }
}
