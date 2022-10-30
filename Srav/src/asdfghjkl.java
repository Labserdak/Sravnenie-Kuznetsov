import java.util.Objects;
import java.util.Scanner;

public class asdfghjkl {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a_num = 1;
        System.out.print("Input number 1: ");
    int a = in.nextInt();
        System.out.println();

    int b;
    int cycle = 2;

        while (true){
        System.out.printf("Input number %d: ",cycle);
        b = in.nextInt();
        System.out.println();
        if (a>b){
            System.out.printf("Number #%d (%d) bigger than #%d (%d)\n",a_num,a,cycle,b);
        }
        else if (a==b){
            System.out.println("Equals");
        }
        else{
            System.out.printf("Number #%d (%d) bigger than #%d (%d)\n",cycle,b,a_num,a);
            a = b;
            a_num = cycle;
        }
        cycle++;
    }
}
}
