package players3;

public class Player5 extends SongPlayerAbst implements PlayAllSongs {
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
