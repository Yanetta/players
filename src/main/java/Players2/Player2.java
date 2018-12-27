package Players2;

public class Player2 implements SongPlayer {
    final int price;

    public Player2(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        System.out.println("Error");

    }
}