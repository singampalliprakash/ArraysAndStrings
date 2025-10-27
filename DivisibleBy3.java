package arraysAndStrings;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(Stringx[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0){
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
        sc.close();
    }
}
