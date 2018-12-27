package Players1;

public class Player4 extends PlaySongAbst implements AllSongsPlayer {
    public Player4 (int price) {
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
