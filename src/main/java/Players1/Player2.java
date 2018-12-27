package Players1;

public class Player2 extends PlaySongAbst {

    public Player2(int price) {
        super(price);
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        System.out.println("Error");

    }

}


