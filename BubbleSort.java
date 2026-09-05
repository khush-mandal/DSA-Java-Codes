import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int array [] = {9,2,6,7,3,5,0,1};
        int swap = 0;
        for(int i=0; i<array.length -1;i++){
          
            for(int j=0;j<array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    // swap
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                    swap++;
                    
                }
                
                
            }
            if(swap==0){
                System.out.println("Array is already sorted");
            }
            
        }
        
        System.out.println(Arrays.toString(array));
} 
}
