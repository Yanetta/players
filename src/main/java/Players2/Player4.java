package Players2;

public class Player4 extends AllSongsAbst {

        final int price;

    public Player4 (int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }

    @Override
    public void playSong() {
        System.out.println("Playing"  + PLAY_LIST[2]);

    }
}
