import java.util.Scanner;
public class gift_hamper 
{
    public static void main(String args[])
    {
        int no_of_products, price, tot_price = 0, ctr;
        Scanner sc = new Scanner(System.in);
        no_of_products = sc.nextInt();
        for(ctr = 1; ctr <= no_of_products; ctr++)
        {
            price = sc.nextInt();
            tot_price = tot_price + price;           
        }
        int num;
        for(num = 1; num*num*num < tot_price; num++);
        if(num*num*num == tot_price)
         System.out.println("YES");
        else 
         System.out.println((num*num*num)-tot_price);
    }    
}
