import java.util.*;

public class EncryptionMachine {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final int SHIFT = 3;
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      intro();
      key(console);
      encryptMessage(console);
      outro();
    
    
    }
    
   public static void intro() {
      System.out.println("Welcome to the CSE142 Encryption Machine!");
      System.out.println("The program lets you encrypt a message");
      System.out.println("with a key so your recipient can decrypt.");
      System.out.println();
   }

   public static void key(Scanner console) {
      System.out.println("Encrypted messages use a shared keyword to decrypt. ");
      System.out.print("Enter key: ");
      String code = console.next();
      System.out.print("\"" + code + "\"");
      System.out.print(" has been encrypted to: ");
      for(int i = 0; i < code.length(); i++) {
         encryptLetter(code.charAt(i));
      }
      System.out.println();  
   }

    public static void encryptLetter(char count) {
         int j = ALPHABET.indexOf(count);
          j = (j + SHIFT) % ALPHABET.length();
          System.out.print(ALPHABET.charAt(j));
   }
   
    public static void encryptWord(Scanner console) {
      System.out.print("Next word. ");
      String encrypt = console.next();
      System.out.print("\"" + encrypt + "\"");
      System.out.print(" has been encrypted to: ");
      for(int i = 0; i < encrypt.length(); i++) {
         encryptLetter(encrypt.charAt(i));
      }
      System.out.println();
   }
   
    public static void encryptMessage(Scanner console) {
        System.out.print("How many words are in your message? ");
        int wordCount =  console.nextInt();
        for(int i = 0; i < wordCount; i++) {
            encryptWord(console);
        }
    }
       
    public static void outro() {
        System.out.print("Message fully encrypted. ");
        System.out.println("Happy secret messaging!");
    }

}