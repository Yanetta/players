package Players2;

public class Player6 extends AllSongsAbst {

    final int price;

    public Player6(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void shuffle() {

        for (int i = 0; i < PLAY_LIST.length; i++) {
            double a = Math.random() * 3;
            System.out.println(PLAY_LIST[(int) a]);
        }
    }
}