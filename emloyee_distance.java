import java.util.*;
public class emloyee_distance 
{
    public static void main(String args[])
    {
        int tot_inp, st_range, end_range, val, ctr, flag = 0, abs_val;
        Scanner sc = new Scanner(System.in);
        tot_inp = sc.nextInt();
        st_range = sc.nextInt();
        end_range = sc.nextInt();

        for(ctr = 1; ctr <= tot_inp; ctr++)
        {
            val = sc.nextInt();
            if(val < 0)
             abs_val = val * (-1);
            else 
             abs_val = val;
            if(abs_val >= st_range && abs_val <= end_range)
             System.out.println(val);
             flag = 1;
        }
        if(flag == 0)
         System.out.println("1");
    }
}
