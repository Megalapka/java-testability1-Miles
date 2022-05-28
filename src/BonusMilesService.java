public class BonusMilesService {
    public int calculate(int cost) {
        int rubsForMile = 20;
        int bonus = cost / rubsForMile;
        return bonus;
    }

}
