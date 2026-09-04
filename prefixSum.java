public class prefixSum {
    public static void main (String args []){
        int array[] = {2,4,6,8,9};
        int prefixSum [] = new int[array.length];
        int currSum ;
        for (int i=0;i<array.length;i++){
            for (int j=i;j<array.length;j++){
                currSum=0;
                for (int k=i;k<j;k++){
                    currSum += array[k];
                    prefixSum[i]=currSum;
        }
        System.out.println(prefixSum);
        }
        }
    }
}