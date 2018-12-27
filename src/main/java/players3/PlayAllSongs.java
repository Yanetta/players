package players3;

public interface PlayAllSongs {
    default public void playAllSongs() {
        for (String song:SongPlayerAbst.PLAY_LIST) {
            System.out.println(song);
        }
    }
}
