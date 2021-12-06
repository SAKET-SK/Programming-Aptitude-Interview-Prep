import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       int ni, ne, i = 0;
       float intP = 18, extP = 12, cost = 0, temp;
       Scanner sc = new Scanner(System.in);
       ni = sc.nextInt();
       ne = sc.nextInt();
       if(ni < 0 || ne < 0) {
           System.out.print("INVALID INPUT");
       } else if(ni == 0 && ne == 0) {
           System.out.print("Total estimated Cost : 0.0");
       } else {
           for(i = 0; i < ni; i++) {
               temp = sc.nextFloat();
               cost += intP * temp;
           }
           for(i = 0; i < ne; i++) {
               temp = sc.nextFloat();
               cost += extP * temp;
           }
           System.out.printf("Total estimated Cost : %.1f", cost);
       }
    }
}
