import java.util.Scanner;
public class no_of_participants 
{
    public static void main(String args[])
    {
        int tot_participants;
        Scanner sc = new Scanner(System.in);
        tot_participants = sc.nextInt();

        if(tot_participants >= 100 && tot_participants <= 200)
        {
            System.out.println(+tot_participants/4+  " ->  Participants of Group A");
            System.out.println(+tot_participants/4+  " ->  Participants of Group A");
            System.out.println(+tot_participants/4+  " ->  Participants of Group A");
            if(tot_participants %2 == 0)
             System.out.println(+tot_participants/4+  " ->  Participants of Group A");
            else 
             System.out.println(+(tot_participants/4) + (tot_participants%4)+  " ->  Participants of Group A");
        }
        else
        System.out.println("INVALID INPUT");
    }    
}
