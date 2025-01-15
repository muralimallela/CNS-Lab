import java.io.*;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import java.util.Base64;

public class BlowFish {
    public static void main(String[] args) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
        keyGenerator.init(128);
        Key secretKey = keyGenerator.generateKey();
        
        Cipher cipherOut = Cipher.getInstance("Blowfish/CFB/NoPadding");
        cipherOut.init(Cipher.ENCRYPT_MODE, secretKey);
        
        byte iv[] = cipherOut.getIV();
        if (iv != null) {
            System.out.println("Initialization Vector of the Cipher: " + Base64.getEncoder().encodeToString(iv));
        }
        
        FileInputStream fin = new FileInputStream("inputFile.txt");
        byte[] inputBytes = new byte[fin.available()];
        fin.read(inputBytes);
        fin.close();
        
        String inputFileContents = new String(inputBytes);
        System.out.println("Contents of inputFile.txt: " + inputFileContents);
        
        FileOutputStream fout = new FileOutputStream("outputFile.txt");
        CipherOutputStream cout = new CipherOutputStream(fout, cipherOut);
        cout.write(inputBytes);
        cout.close();
        
        FileInputStream foutRead = new FileInputStream("outputFile.txt");
        byte[] outputBytes = new byte[foutRead.available()];
        foutRead.read(outputBytes);
        foutRead.close();
        
        System.out.print("Contents of outputFile.txt: ");
        for (byte b : outputBytes) {
            System.out.print((char) b);
        }
        System.out.println();
    }
}
