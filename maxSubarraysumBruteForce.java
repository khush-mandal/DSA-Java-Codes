import java.util.Scanner;

public class maxSubarraysumBruteForce{
 public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("enter array size : ");
    int n = input.nextInt();
    int array [] = new int [n];
    for (int i=0;i<n;i++){
        System.out.print("enter element no " + (i+1) +" : ");
        array[i] = input.nextInt();
    }
    System.out.print("Array is : [ ");
    for (int i=0;i<n;i++){
        System.out.print( array[i] + ", ");
    }
     System.out.println("]");
                              //logic
    int currSum ;
    int maxsum =Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum += array[k];
                }
                if( currSum > maxsum){
                    maxsum = currSum;
                }
            }
        }
        System.out.println("maximum sum is : " + maxsum);
 }
}