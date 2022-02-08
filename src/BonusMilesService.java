public class BonusMilesService {
    public int calculate(int tiсketPrice) {

        int oneBonusMileCost = 20;
        int countBonusMiles = tiсketPrice / oneBonusMileCost;

        return countBonusMiles;

    }
}
