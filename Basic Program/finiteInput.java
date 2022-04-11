import java.util.*;

public class finiteInput {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        for(int i = 0; i<100000; i++){
            int num = sc.nextInt();

            if (num == 0){
				System.out.println("0");
				break;
				
			}else{
				System.out.print(num + " ");
				
			}
        }
    }
    
}
