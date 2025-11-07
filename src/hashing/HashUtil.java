package hashing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtil {
    private HashUtil(){}
    //

    public static String bytesToHex(byte[] hashBytes){
        StringBuilder hex = new StringBuilder();
        for(byte b:hashBytes){
            hex.append(String.format("%02x",b));
        }
        return hex.toString();
    }

    public static String HashString(String text){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(text.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hashBytes);
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("SHA-256 algorithm not found!");
        }
        return null;
    }
    public static String hashFile(String filePath){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            try(InputStream is = Files.newInputStream(Paths.get(filePath));
                BufferedInputStream bis = new BufferedInputStream(is)){
                byte[] buffer = new byte[8192];
                int byteRead;
                while((byteRead = bis.read(buffer))!=-1){
                    md.update(buffer,0,byteRead);
                }
            }
            byte[] hashBytes = md.digest();
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException | IOException e) {
            System.out.println("SHA-256 algorithm not found!");
        }
        return null;
    }

}
