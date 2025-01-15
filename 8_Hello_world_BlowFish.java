import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
importjavax.swing.JOptionPane;
public class BlowFishCipher {
public static void main(String[] args) throws Exception {
// create a keygenerator based upon the Blowfish cipher
KeyGenerator keygenerator =KeyGenerator.getInstance("Blowfish");
// create a key
// create a cipher based upon Blowfish
Cipher cipher= Cipher.getInstance("Blowfish");
// initialise cipher to with secret key
cipher.init(Cipher.ENCRYPT_MODE, secretkey);
// get the text to encrypt
String inputText = JOptionPane.showInputDialog("Input your message: "); // encrypt
messagebyte[] encrypted = cipher.doFinal(inputText.getBytes());
//re-initialisetheciphertobeindecryptmode
cipher.init(Cipher.DECRYPT_MODE, secretkey);
// decrypt message
byte[] decrypted = cipher.doFinal(encrypted);
// and display the results
JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\nEncrypted text:"+ new
String(encrypted)+"\n"+"\nDecryptedtext:"+ new String(decrypted));
System.exit(0);
} }
