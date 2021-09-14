import java.util.*;
public class BIn_to_Dec 
{
    public static void main(String args[])
    {
        int power = 1, res = 0, digit;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input > 0)
        {
            digit = input % 10;
            res = res + (digit * power);
            power = power * 2;
            input = input / 10;
        }
        System.out.println(res);
    }    
}
