package Players1;

public class Player5 extends PlaySongAbst implements AllSongsPlayer {
    public Player5(int price) {
        super(price);
    }
    public int getPrice() {
        return price;
    }
    @Override
    public void playAllSongs(){
        for (int i = PLAY_LIST.length -1; i>=0; i--){
            System.out.println(PLAY_LIST[i]);
        }
    }
}
