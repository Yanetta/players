package players3;

public abstract class SongPlayerAbst {
    static final String SONG_1 = "Love me tender", SONG_2 =  "The best song", SONG_3 = "Super song";
    static final String[] PLAY_LIST = {SONG_1, SONG_2, SONG_3};
    final  int price;
    public SongPlayerAbst (int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void playSong(){
        System.out.println("Playing "  + PLAY_LIST[1]);
    };


}
