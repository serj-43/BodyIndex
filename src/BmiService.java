public class BmiService {
    String calculate(int heigth, float weigth) {
        String result = "Вес в норме";
        double index;

        index = weigth / Math.pow((float) heigth / 100, 2);

        if (index > 25 && index < 30) {
            result = "Вес в избытке";
        } else if (index > 25 && index < 30) {
            result = "I степень ожирения";
        } else if (index > 25 && index < 30) {
            result = "II степень ожирения";
        } else if (index > 40) {
            result = "III степень ожирения";
        }

        return String.format("ИМТ: %.2f ", index) + " " + result;
    }
}
