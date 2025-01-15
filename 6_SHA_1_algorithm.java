import java.security.*;
public class SHA1 {
public static void main(String[] a)
{
try
{
MessageDigest md = MessageDigest.getInstance("SHA1");
System.o ut.printl n("Message digest object info: ");
System.out.printl n(" Algorithm = " +md.getAlgorithm());
System.out.printl n(" Provider = " +md.getProvi der());
System.out.println(" ToString = " +md.toString());
String input = "";
md.update(input.getBytes());
byte[] output = md.digest();
System.out.println();
System.out.println("SHA1(\""+input+"\") = " +bytesToHex(output));
input = "abc";
md.update(input.getBytes());
output = md.digest();
System.out.println();
System.out.println("SHA1(\""+input+"\") = " +bytesToHex(output));
input = "abcdefghijklmnopqrstuvwxyz";
md.update(input.getBytes());
output = md.digest();
System.out.println();
System.out.println("SHA1(\"" +input+"\") = " +bytesToHex(output));
System.out.println();
}
catch (Exception e) {
System.out.println("Exception: " +e);
}
}
public static String bytesToHex(byte[] b) {
char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
StringBufferbuf=new
StringBuffer();for (int j=0;
j<b.l ength;j++)
{ buf.append(hexDigit[(b[j] >> 4) &
0x0f]);buf.append(hexDigit[b[j] &
0x0f]);
}
returnbuf.toString(); }
}