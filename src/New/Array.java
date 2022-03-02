//package New;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=input.nextInt();
        int[] arr = new int[2*n];

        for(int i=0;i<2*n;i++){
            arr[i]= input.nextInt();
        }

        int countEven=0;
        int countOdd=0;

        for(int num:arr){
            if(num%2==0){
                countEven+=1;
            }

            else{
                countOdd+=1;
            }
        }

        if(countEven==countOdd && (countEven+countOdd)==2*n){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }

    }
}
