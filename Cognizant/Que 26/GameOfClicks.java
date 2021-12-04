import java.util.*;
public class  GameOfClicks
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     int l=sc.nextInt();
     int h=sc.nextInt();
     int b=sc.nextInt();
     List<Integer>bl=new ArrayList<>();
     for(int i=0;i<b;i++){
         bl.add(sc.nextInt());
     }
      int v=sc.nextInt();
      List<Integer>vl=new ArrayList<>();
      for(int i=0;i<v;i++){
         vl.add(sc.nextInt());
      }
       Set<Integer>sl=new HashSet<>();
       int res=0;
      for(Integer i:vl){
          if(bl.contains(i))
           continue;
             sl.add(i);
         }
      for(Integer i:sl){
                     String s=i+"";
           res+=s.length();
      }  
      System.out.println(res);
    
  }
}
