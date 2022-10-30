import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int num = in.nextInt();
        double[] arr = new double[(int) num];
        System.out.println("Insert array elements(separated by commas):");
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.print("Inserted array elements:");
            for (double v : arr) {
                System.out.print(" " + v);
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] > arr[k])  System.out.println(arr[i] + " > " + arr[k]);
                    else if (arr[i] < arr[k]) System.out.println(arr[i] + " < " + arr[k]);
                    else System.out.println(arr[i] + " = " + arr[k]);
                }
            }
            System.out.println();
        }
        catch (Exception ignored) {}
        }
    }
