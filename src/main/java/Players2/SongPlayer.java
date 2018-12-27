package Players2;

public interface SongPlayer {
    static final String SONG_1 = "Love me tender", SONG_2 =  "The best song", SONG_3 = "Super song";
    static  final String[] PLAY_LIST = {SONG_1, SONG_2, SONG_3};


    default public void playSong(){
        System.out.println("Playing "  + PLAY_LIST[1]);
    };
}
