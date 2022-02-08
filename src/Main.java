public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int tiсketPrice = 10_000;
        int miles = service.calculate(tiсketPrice);
        System.out.println("Количество бонусных миль: " + miles);
    }
}
