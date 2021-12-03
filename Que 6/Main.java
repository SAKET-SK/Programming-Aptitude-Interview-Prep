import java.util.Scanner;
public class Main 
{

    public static void main(String args[])
    {     
        System.out.print("Enter the month:");
        Scanner s = new Scanner(System.in);
        int entry = s.nextInt();
        
        switch (entry)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Season:Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season:Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season:Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Season:Autumn");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
