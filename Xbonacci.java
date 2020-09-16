/**
 *
 * As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2)
 * numbers of the sequence to generate the next.
 *
 * Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that
 * given a signature array, returns the first n elements - signature included of the so seeded sequence.
 *
 * Kata: Tribonacci Sequence
 *
 */


import java.util.Arrays;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double a[] = Arrays.copyOf(s,n);
        for (int i = 3; i < n; i++) {
            a[i] = a[i -  3] + a[i -  2] + a[i -  1];
        }
        return a;
    }
}