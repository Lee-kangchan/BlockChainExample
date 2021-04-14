package example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class util {
    public static String applySHA256(String input){

        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte hash[] = md.digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuffer hashValue = new StringBuffer();
            for(int i = 0 ; i <hash.length; i++){
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1 ) {
                    hashValue.append("0");
                }
                    hashValue.append(hex);
            }
            return hashValue.toString();
        }catch(Exception e) {
            throw new RuntimeException();
        }
    }
}
