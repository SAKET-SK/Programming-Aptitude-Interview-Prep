import java.util.Scanner;
class Main {
    public static void main(String[] args) {
   	 int[][] trainee = new int[3][3];
   	 int[] average = new int[3];
   	 int max = 0;
   	 Scanner sc = new Scanner(System.in);
   	 for(int i = 0; i < 3; i++) {
   		 for(int j = 0; j < 3; j++) {
   			 trainee[i][j] = sc.nextInt();
   			 if(trainee[i][j] < 1 || trainee[i][j] > 100) {
   				 trainee[i][j] = 0;
   			 }
   		 }
   	 }
   	 for(int i = 0; i < 3; i++) {
   		 for(int j = 0; j < 3; j++) {
   			 average[i] = average[i] + trainee[j][i];
   		 }
   		 average[i] = average[i] / 3;
   	 }
   	 for(int i = 0; i < 3; i++) {
   		 if(average[i] > max) {
   			 max = average[i];
   		 }
   	 }
   	 for(int i = 0; i < 3; i++) {
   		 if(average[i] == max) {
   			 System.out.println("Trainee Number : " + (i + 1));
   		 }
   		 if(average[i] <70) {
   			 System.out.print("Trainee is Unfit");
   		 }
   	 }
    }

}
