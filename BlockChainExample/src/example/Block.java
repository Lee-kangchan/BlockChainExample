package example;

public class Block {
    public static String hash;
    public static String data;
    public static int nonce;
    public static String previousHash;

    Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.hash = getHash();
    }
    public static String getHash(){
        return util.applySHA256(Integer.toString(nonce) + data + previousHash);
    }
    public static void mine(int difficulty){
        StringBuffer diff = new StringBuffer();
        for(int i = 0 ; i<difficulty; i++) diff.append("0");
        while(!hash.substring(0,difficulty).equals(diff.toString())){
            nonce++;
            hash = getHash();
        }
        System.out.println("nonce 값: " +  nonce + " hash값 " + hash);
    }
}
