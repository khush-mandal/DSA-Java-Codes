public class prefixSum {
    public static void main (String args []){
        int array[] = {2,4,6,8,9 };
        int prefixSum [] = new int[array.length];
        int currSum ;
        int maxSum = Integer.MIN_VALUE;
        prefixSum[0]=array[0];
        for(int i=1; i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + array[i];
        }  
        for (int i=0;i<=array.length;i++){
            for (int j=i;j<array.length;j++){
                 currSum=0;
              currSum = i==0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1]; 
              if(currSum > maxSum){
                maxSum = currSum;
              }
        }
        }
        System.out.println("max sum is : "+ maxSum);
    }
}