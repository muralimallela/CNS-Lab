import java.io.*;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import java.util.Base64;

public class BlowFish {
    public static void main(String[] args) throws Exception {
        // Generate a Blowfish key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
        keyGenerator.init(128);
        Key secretKey = keyGenerator.generateKey();
        
        // Create a Cipher for Blowfish encryption with CFB mode
        Cipher cipherOut = Cipher.getInstance("Blowfish/CFB/NoPadding");
        cipherOut.init(Cipher.ENCRYPT_MODE, secretKey);
        
        // Get the Initialization Vector (IV) used for encryption
        byte iv[] = cipherOut.getIV();
        if (iv != null) {
            System.out.println("Initialization Vector of the Cipher: " + Base64.getEncoder().encodeToString(iv));
        }
        
        // Display contents of the input file before encryption
        FileInputStream fin = new FileInputStream("inputFile.txt");
        byte[] inputBytes = new byte[fin.available()];
        fin.read(inputBytes);
        fin.close();
        
        // Convert byte array to string (assuming the file contains text data)
        String inputFileContents = new String(inputBytes);
        System.out.println("Contents of inputFile.txt: " + inputFileContents);
        
        // Encrypt the file and write to output file
        FileOutputStream fout = new FileOutputStream("outputFile.txt");
        CipherOutputStream cout = new CipherOutputStream(fout, cipherOut);
        cout.write(inputBytes);
        cout.close();
        
        // Display contents of the encrypted output file
        FileInputStream foutRead = new FileInputStream("outputFile.txt");
        byte[] outputBytes = new byte[foutRead.available()];
        foutRead.read(outputBytes);
        foutRead.close();
        
        // Print the raw contents of the encrypted file (as bytes)
        System.out.print("Contents of outputFile.txt: ");
        for (byte b : outputBytes) {
            System.out.print((char) b);  // Prints the raw bytes as characters (which may not be readable)
        }
        System.out.println();  // For a clean line break
    }
}
