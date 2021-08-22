public class BonusMilesService {
    public int calculate(int cost) {
        int quantity = 20;
        int bonus = cost / quantity;
        return bonus;
    }
}
