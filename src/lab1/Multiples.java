package lab1;

import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(9, 3, 5);
        System.out.println(count);
    }

    static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }

        return count;
    }
}
