package New;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c1=0;
        int c2=0;
        //input for A
        int g1=input.nextInt();
        int p1= input.nextInt();
        int d1= input.nextInt();

        //input for B
        int g2=input.nextInt();
        int p2= input.nextInt();
        int d2= input.nextInt();

        if(g1>g2){
            c1+=1;
        }
        else{
            c2+=1;
        }

        if(p1>p2){
            c1+=1;
        }
        else{
            c2+=1;
        }

        if(d1>d2){
            c1+=1;
        }
        else{
            c2+=1;
        }

        if(c1>c2){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
}
