package players3;

public class Player4 extends SongPlayerAbst implements PlayAllSongs {
    public Player4(int price) {
        super(price);
    }
    public int getPrice() {
        return price;
    }
    @Override
    public void playSong() {
        System.out.println("Playing"  + PLAY_LIST[2]);

    }
}
