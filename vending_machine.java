import java.util.Scanner;
public class vending_machine 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char main_menu = sc.next().charAt(0);
        int sub_menu = sc.nextInt();

        switch(main_menu)
        {
            case 'c':
            case 'C':
                       switch(sub_menu)
                       {
                           case 1:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Espresso Coffee");
                                   break;
                           case 2:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Cappuccino Coffee");
                                   break; 
                           case 3:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Latte Coffee");
                                   break;
                           default:
                                   System.out.println("INVALID INPUT");
                       }
                        break;
            case 't':
            case 'T': 
                        switch(sub_menu)
                        {
                           case 1:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Plain Tea!");
                                  break;
                           case 2:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Assam Tea!");
                                  break;
                           case 3:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Ginger Tea!");
                                  break;
                           case 4:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Cardamom Tea!");
                                  break;
                           case 5:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Masala Tea!");
                                  break;
                           case 6:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Lemon Tea!");
                                  break;
                           case 7:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Green Tea!");
                                  break;
                           case 8:
                                  System.out.println("Welcome to CCD!");
                                  System.out.println("Enjoy your Organic Darjeeling Tea!");
                                  break;
                           default:
                                  System.out.println("INVALID INPUT");
                                  break;
                        }
                        break;
            case 's':
            case 'S':
                        switch(sub_menu)
                        {
                           case 1:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Hot and Sour Soup!");
                                   break;
                           case 2:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Veg Corn Soup!");
                                   break;
                           case 3:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Tomato Soup!");
                                   break;
                           case 4:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Spicy Tomato Soup!");
                                   break;
                           default:
                                   System.out.println("INVALID INPUT");
                                   break;
                        }
                        break;
            case 'b':
            case 'B':
                        switch(sub_menu)
                        {
                            case 1:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Hot Chocolate Drink!");
                                   break;
                            case 2:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Badam Drink!");
                                   break;
                            case 3:
                                   System.out.println("Welcome to CCD!");
                                   System.out.println("Enjoy your Badam-Pista Drink!");
                                   break;
                            default:
                                   System.out.println("INVALID INPUT");
                                   break;
                        }
            default:
                        System.out.println("INVALID INPUT");
                        break;
        }
    }    
}
