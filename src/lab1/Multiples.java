package lab1;

import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        if (a==b) return (int) ((double) (n - 1 )/ a);
        return (int) (n * ((double)(a + b - 1) /(a * b)));
    }

    public static int multiples(){
        return Multiples.multiples(1000, 3, 5);
    }
}
