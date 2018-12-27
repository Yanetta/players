package Players1;

public interface AllSongsPlayer extends SongPlayer {

    default public void playAllSongs() {
        for (String song : SongPlayer.PLAY_LIST) {
            System.out.println(song);
        }
    }
}
