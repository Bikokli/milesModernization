public class BonusMilesService {
    private final int promotionalConverter = 20;

    public int calculate(int cost) {
        int milesAmount = cost / promotionalConverter;
        return milesAmount;
    }
}