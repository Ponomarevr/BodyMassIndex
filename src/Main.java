public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myWeight = 62.5; //вес в кг
        double myHeight = 1.74; //рост в метрах!
        double myBmi = service.calculate(myWeight, myHeight);
        System.out.println(myBmi);

    }
}