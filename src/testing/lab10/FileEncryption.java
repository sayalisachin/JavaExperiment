package testing.lab10;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class FileEncryption {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.dat";
        String decryptedFile = "decrypted.txt";
        String secretKey = "mysecretkey";

        try {
            // Encrypt the file
            encryptFile(inputFile, encryptedFile, secretKey);

            // Decrypt the file
            decryptFile(encryptedFile, decryptedFile, secretKey);

            System.out.println("Encryption and decryption completed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void encryptFile(String inputFile, String encryptedFile, String secretKey) throws Exception {
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(encryptedFile);

        byte[] keyBytes = secretKey.getBytes();
        SecretKey key = new SecretKeySpec(keyBytes, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        CipherOutputStream cos = new CipherOutputStream(fos, cipher);

        byte[] block = new byte[8];
        int i;
        while ((i = fis.read(block)) != -1) {
            cos.write(block, 0, i);
        }
        cos.close();
        fis.close();
    }

    private static void decryptFile(String encryptedFile, String decryptedFile, String secretKey) throws Exception {
        FileInputStream fis = new FileInputStream(encryptedFile);
        FileOutputStream fos = new FileOutputStream(decryptedFile);

        byte[] keyBytes = secretKey.getBytes();
        SecretKey key = new SecretKeySpec(keyBytes, "AES");

        Cipher cipher
