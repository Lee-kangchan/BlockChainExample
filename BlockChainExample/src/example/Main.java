package example;

public class Main {

    public static void main(String[] args) {
        Block block = new Block("sale", "123");
        block.mine(3);

        Block block2 = new Block("sale2", "0");
        block2.mine(3);


        Block block3 = new Block("sale", "0");
        block3.mine(3);
    }
}
