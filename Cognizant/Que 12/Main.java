import java.util.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Scanner sc=new Scanner(System.in);
      
     int num = Integer.parseInt(br.readLine());
     int itemPrice[] = new int[num];
     int itemDis[] = new int[num];
     String itemName[] = new String[num];
     //String[] values;
     float dis[] = new float[num];
     String[] input = new String[num];

     for(int i=0;i<num;i++)
     {
        String s[]= br.readLine().split(",");
        itemName[i] =s[0];
        //System.out.println(itemName[i]);
        itemPrice[i]=Integer.parseInt(s[1]);
       // System.out.println(itemPrice[i]);
        itemDis[i]=Integer.parseInt(s[2]);
       // System.out.println(itemDis[i]);
        //float  x = itemDis[i]
        dis[i]=(float)((itemDis[i]*itemPrice[i])/100);
       // System.out.println(dis[i]);
     }
     int idx[]=new int[num];
     int j=0;
     float min= Float.MAX_VALUE;
     for(int i=0;i<num;i++){
       if(dis[i]<=min)
       {
           min=dis[i];
           idx[j++]=i;
           //System.out.println(min);
       }  
     }
     for(int i=0;i<j;i++){
         System.out.println(itemName[idx[i]]);
         //System.out.println(idx[i]);
     }
  }
}
