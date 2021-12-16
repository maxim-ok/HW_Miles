public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int tiketPrice = 10_000;
        int miles = service.calculate(tiketPrice);
        System.out.println("Количество бонусных миль: " + miles);
    }
}
