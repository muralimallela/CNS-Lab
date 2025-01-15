public class DHK {
    private static long power(long a, long b, long p) {
        long result = 1;
        a = a % p;
        while (b > 0) {
            if (b % 2 == 1)
                result = (result * a) % p;
            b = b >> 1;
            a = (a * a) % p;
        }
        return result;
    }

    public static void main(String[] args) {
        long q, a, xa, xb, ya, yb, ka, kb;


        q = 23;
        System.out.println("The value of q: " + q);

        a = 9;
        System.out.println("The value of a: " + a);


        xa = 4;
        System.out.println("The private key a for Alice: " + xa);

        ya = power(a, xa, q);
        System.out.println("The public key of Alice: " + ya);

        xb = 3;
        System.out.println("The private key b for Bob: " + xb);

        yb = power(a, xb, q);
        System.out.println("The public key of Bob: " + yb);

        ka = power(yb, xa, q);
        kb = power(ya, xb, q);

        System.out.println("Secret key for Alice is: " + ka);
        System.out.println("Secret key for Bob is: " + kb);
    }
}
