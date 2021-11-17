import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            boolean isAnInt = input.hasNextInt();
            if(isAnInt) {
                int num = input.nextInt();
                count++;
                sum+=num;
                
            }else{
                break;
            }
        }
        double average = ((double)sum / (double)count);
        //int roundedAvg = (int)Math.round(average);
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
    }
}
