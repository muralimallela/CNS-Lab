public class DHK {
    // Power function to return value of a ^ b mod P
    private static long power(long a, long b, long p) {
        long result = 1;
        a = a % p; // In case a is larger than p
        while (b > 0) {
            // If b is odd, multiply a with result
            if (b % 2 == 1)
                result = (result * a) % p;
            // Now b must be even
            b = b >> 1; // b = b / 2
            a = (a * a) % p; // Change a to a^2
        }
        return result;
    }

    // Driver code
    public static void main(String[] args) {
        long q, a, xa, xb, ya, yb, ka, kb;
        
        // Both the persons will agree upon the
        // Global public elements G and P
        // A prime number q is taken
        q = 23;
        System.out.println("The value of q: " + q);

        // A primitive root for q, a is taken
        a = 9;
        System.out.println("The value of a: " + a);

        // Alice will choose the private key xa
        // xa is the chosen private key
        xa = 4;
        System.out.println("The private key a for Alice: " + xa);

        // Generate the public key by Alice
        ya = power(a, xa, q);
        System.out.println("The public key of Alice: " + ya);

        // Bob will choose the private key xb
        // xb is the chosen private key
        xb = 3;
        System.out.println("The private key b for Bob: " + xb);

        // Generate the public key by Bob
        yb = power(a, xb, q);
        System.out.println("The public key of Bob: " + yb);

        // Generating the secret key after the exchange of keys
        ka = power(yb, xa, q); // Secret key for Alice
        kb = power(ya, xb, q); // Secret key for Bob

        System.out.println("Secret key for Alice is: " + ka);
        System.out.println("Secret key for Bob is: " + kb);
    }
}
