import java.math.*;
import java.util.*;
public class RSA
{
public static int getGCD(int mod, int num)
{
if (mod == 0)
return num;
else
return getGCD(num % mod, mod);
}
public static void main(String args[])
{
int d = 0, e;
int message = 32;
int prime1 = 5;
int prime2 = 7;
int n = prime1 * prime2;
int etf = (prime1 - 1) * (prime2 - 1);
System.out.println("primeMul1 is equal to : " + etf + "\n");
for (e = 2; e < etf; e++)
{
if (getGCD(e, etf) == 1)
{
break;
}
}
System.out.println("Public key e is = " + e);

for (int m = 0; m <= 9; m++)
{
int temp = 1 + (m * etf);
if (temp % e == 0)
{
d = temp / e;
break;
} }
System.out.println("d is : " + d);
double cipher;
BigInteger d_message; 
cipher = (Math.pow(message, e)) % n;
System.out.println("Cipher text is : " + cipher); 
BigInteger bigN = BigInteger.valueOf(n); 
BigInteger bigC = BigDecimal.valueOf(cipher).toBigInteger(); 
d_message = (bigC.pow(d)).mod(bigN);
System.out.println("Decrypted text is : " + d_message); } }