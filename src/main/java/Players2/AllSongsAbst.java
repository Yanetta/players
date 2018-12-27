package Players2;

public abstract class AllSongsAbst implements SongPlayer{

       public void playAllSongs() {
        for (String song:PLAY_LIST) {
            System.out.println(song);
            }
    }
}
