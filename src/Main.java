public class Main {
    public static void main(String[] args) {
        int heigth = 182;
        float weigth = 86.00F;
        BmiService service = new BmiService();
        System.out.println(service.calculate(heigth, weigth));
    }
}
