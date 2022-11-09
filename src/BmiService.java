public class BmiService {

    public double calculate(double height, double weight) {

        double x = height / 100;
        double bmi = weight / (x * x);
        return bmi;
    }

}

