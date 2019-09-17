package Tests;

public class StatsTest {
    public static void main(String[] args) {
        Stats stats = new Stats();
        stats.giveValue(3);
        stats.printValues();
        stats.giveValue(2);
        stats.printValues();
        stats.giveValue(-5);
        stats.printValues();
        stats.giveValue(10);
        stats.printValues();
        stats.giveValue(33);
        stats.printValues();
        stats.giveValue(1);
        stats.printValues();
    }
}
