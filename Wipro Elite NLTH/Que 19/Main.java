import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String target=sc.next();
        str=str.trim();
        String arr[]=str.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i].trim();
            if(arr[i].equals(target))
                count++;
        }
        System.out.println(count);
    }
}
