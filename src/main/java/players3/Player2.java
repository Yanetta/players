package players3;

public class Player2 extends SongPlayerAbst {
    public Player2(int price) {
        super(price);
    }
    public int getPrice() {
        return price;
    }
    @Override
    public void playSong(){
        System.out.println("Error ");
    };
}
