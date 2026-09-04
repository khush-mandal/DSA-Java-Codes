public class kadaneAlgorithm{
    public static void main (String Args []){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        for (int i=0;i<array.length;i++){
            currSum += array[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("maximum sum is : " + maxSum);
    }
}