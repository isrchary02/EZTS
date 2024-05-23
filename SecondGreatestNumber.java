import java.util.Scanner;
public class SecondGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int [] array = new int[size];

        for (int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        
    }
}