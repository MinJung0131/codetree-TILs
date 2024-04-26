import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int zero = sc.nextInt();
        int front = sc.nextInt();
        int back = sc.nextInt();

        System.out.printf("010-%d-%d",back,front);
    }
}