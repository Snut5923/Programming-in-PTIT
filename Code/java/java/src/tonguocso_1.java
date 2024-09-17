import java.util.Scanner;

public class tonguocso_1 {
    public static void main(String[] args) {
        final int mxN = (int)2e6;
        boolean chk[] = new boolean[mxN + 1];
        chk[0] = false;
        chk[1] = false;
        for (int i = 2; i * i <= mxN; ++i) {
            chk[i] = true;
            for (int j = i + i; j <= mxN; j += i)
                chk[j] = false;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int c = A[i];
            for (int j = 2; j <= c; ++j) {
                while (c % j == 0 && chk[j]) {
                    totalSum += j;
                    c /= j;
                }
            }
        }
        System.out.println(totalSum);
    }
}