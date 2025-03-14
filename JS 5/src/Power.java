public class Power {
    int baseNumber, exponent;

    Power (int n, int e) {
        baseNumber = n;
        exponent = e;
    }

    int PowerBF() {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result*baseNumber;
        }
        return result;
    }

    int PowerDC(int n, int e) {
        if (e==1) {
            return n;
        } else {
            if (e%2==1) {
                return (PowerDC(n, e/2)*PowerDC(n, e/2)*n);
            } else {
                return (PowerDC(n, e/2)*PowerDC(n, e/2));
            }
        }
    }
}
