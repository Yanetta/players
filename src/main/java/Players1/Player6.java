package Players1;

public class Player6 extends PlaySongAbst implements AllSongsPlayer {
    public Player6(int price) {
        super(price);
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
