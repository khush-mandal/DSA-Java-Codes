
public class selectionSort {
    public static void printArr(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
    }

    public static void  selectionSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[smallest] ){
                    smallest=j;
                }               
            }
            // swap
                int temp = array[smallest];
                array[smallest] = array[i];
                array[i] = temp;        
    }
       
}
      public static void main(String args[]){
        int array [] = {9,2,6,7,3,5,0,1};
        selectionSort(array);
        System.err.print("Sorted array : ");
        printArr(array);        
} 
}
