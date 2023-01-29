public class Main {
    public static void main(String[] args) {
        BonusMilesServic servic = new BonusMilesServic();
        int prise = 1000; // а зачем эта строчка, если можно в следующей сразу писать значение в скобках?
        int miles = servic.calculate(prise);
        System.out.println("ваши мили:" + miles);
    }
}
