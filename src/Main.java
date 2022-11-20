public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float myBmi = service.calculate(57.5f, 174.5f);

        // System.out.println(myBmi);

        System.out.printf("%.1f", myBmi);

        /* на сайте ВОЗ значения BMI (ИМТ) округлены до 1 знака после запятой,
        поэтому при выводе на экран значения BMI (ИМТ) также округлила до 1 знака после запятой */

    }
}