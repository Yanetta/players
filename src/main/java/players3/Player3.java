package players3;

public class Player3 extends SongPlayerAbst implements PlayAllSongs {
    public Player3(int price) {
        super(price);
    }
    public int getPrice() {
        return price;
    }
}
