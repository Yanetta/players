package Players1;

public abstract class PlaySongAbst implements SongPlayer {
    final  int price;
    public PlaySongAbst (int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
