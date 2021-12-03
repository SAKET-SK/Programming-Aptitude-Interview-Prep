import java.util.*;
class LuckyNum{
    public static void main(String[] args){
        int sum=0;
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the car no:");
        int carNum = sc.nextInt();

        if(carNum<1000 || carNum>9999){
            System.out.println(carNum+" is not a valid car number");
        }
        else{
            while(carNum!=0){
                int l=carNum%10;
                sum=sum+l;
                carNum=carNum/10;
            }

            if(sum%3==0||sum%5==0||sum%7==0){
                System.out.println("Lucky Number");
            }
            else{
                System.out.println("Sorry its not my lucky number");
        }

        }
    }
}
