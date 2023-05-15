public class WaterBottle {

    public WaterBottle(){}

    public int startingVolume(int volume1) {
        return volume1;
    }

    public int addDrink(int volume1, int volume2) {
        return volume1 - volume2;
    }

    public int reduceVolume() {
        return 0;
    }

    public int fillBottle() {
        return 100;
    }


}
