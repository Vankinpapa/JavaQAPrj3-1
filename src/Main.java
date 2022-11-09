public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService ();

        double height = 180; // Укажите рост в сантиметрах
        double weight = 75; // Укажите вес в килограммах
        double bmi = service.calculate(height,weight);

        System.out.println("Ваш индекс массы тела составляет: " + bmi);

    }
}