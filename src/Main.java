import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int a = sc.nextInt();

        for (int i = 0; i < a ; i++) {
            int x = sc.nextInt();

            set.add(x);
        }
        System.out.print("How many students for course B? ");
        int b = sc.nextInt();

        for (int i = 0; i < b ; i++) {
            int x = sc.nextInt();

            set.add(x);
        }
        System.out.print("How many students for course B? ");
        int c = sc.nextInt();

        for (int i = 0; i < c ; i++) {
            int x = sc.nextInt();

            set.add(x);
        }
        System.out.print("Total students: " + set.size());

    }
}