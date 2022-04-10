import java.util.*;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        // System.out.print("Enter the number of elements you want to store: ");  
    
        // int n=sc.nextInt();  
        int n = 100000;
        int[] array = new int[n];  
        // System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++){ 
            array[i]=sc.nextInt();  
            }  
        // System.out.println("Array elements are: ");  
      
         

        for (int i = 0; i< n - 1; i++){
            for (int j = 0; j<n-i-1; j++){
                if (array[j] > array[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i=0; i<n; i++){  
            System.out.print(array[i] + " ");  
        } 
    }
    
}