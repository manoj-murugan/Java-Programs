import java.util.*;
public class decrypt_adj_dig 
{
    public static void main(String args[])
    {
        int input,digit1,digit2,combined_digits,res,power,no_of_digits,safe_digit=0,copy;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        copy = input;
        no_of_digits=0;

        while(input > 0)
        {
            no_of_digits++;
            input = input/10;
        }
        input = copy;

        if(no_of_digits%2==1)
        {
            safe_digit = input%10;
            input = input/10;
        }

        res = 0;
        power = 1;
        while(input > 0)
        {
            digit1 = input%10;
            input = input/10;
            digit2 = input%10;
            input = input/10;
            combined_digits = digit1*10 + digit2;
            res = combined_digits*power + res;
            power = power*100;
        }

        if(no_of_digits%2==1)
        {
            res = res * 10 + safe_digit;
        }
        System.out.println(res);
    }    
}
