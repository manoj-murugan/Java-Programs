import java.util.*;
public class encrypt_key_prime 
{
    public static void main(String args[])
    {
        int input, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        while(input > 0)
        {
            digit = input % 10;
            if(digit == 4 || digit == 6 || digit == 8 || digit == 9)
             sum = sum + digit;  
            input = input / 10;           
        }
        System.out.println(sum);
    }        
}
