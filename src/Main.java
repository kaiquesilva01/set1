import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            int x = sc.nextInt();

            a.add(x);
        }
        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            int x = sc.nextInt();

            b.add(x);
        }
        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            int x = sc.nextInt();

            c.add(x);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.print("Total students: " + total.size());

    }
}