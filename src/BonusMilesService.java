public class BonusMilesService {
    public int calculate(int tiketPrice) {

        int oneBonusMileCost = 20;
        int countBonusMiles = tiketPrice / oneBonusMileCost;

        return countBonusMiles;

    }
}
