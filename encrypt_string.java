import java.util.Scanner;
public class encrypt_string 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int key, ind;
        key = sc.nextInt();
        char str[] = new char[1000];
        str[ind] = sc.next().charAt(ind);
        
        for(ind = 0; str[ind] != '\0'; ind++)
        {
            str[ind]+=key;
        }
        System.out.println(str);
    }
}
