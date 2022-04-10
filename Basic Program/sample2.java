import java.util.*;

public class sample2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);   
        int n = 100000;
        int[] array = new int[n];  
        for(int i=0; i<n; i++){ 
            array[i]=sc.nextInt();  
        }

        for (int i = 1; i<n ; i++){
            int key = array[i];
            int j = i - 1;
        
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        for (int i=0; i<n; i++){  
            System.out.print(array[i] + " ");  
        }
    }
}

