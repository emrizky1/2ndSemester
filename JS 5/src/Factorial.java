public class Factorial {
    int factorialBF(int n) {
        int facto = 1;
        int i = 1; // make sure the iteration start from 1
        while (i <= n) {
            facto = facto * i; // the calculation
            i++; // increment i
        }
        return facto;
    }

    int factorialDC(int n) {
        if (n==1) {
            return 1;
        } else {
            int facto = n * factorialDC(n-1);
            return facto;
        }
    }
}