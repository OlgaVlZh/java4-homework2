public class BmiService {

    public float calculate(float weight, float height) {

        /* на всех сайтах, что я просмотрела, вес вводится в кг с одним (редко с двумя) знаком после запятой,
        поэтому weight - типа float, а рост вводится в сантиметрах (не смотря на то, что расчет осуществляется
        в метрах квадратных), height - тоже типа float, т.к. в медицинских картах рост может быть указан
         в виде 174,5 см */

        float result = weight * 10_000 / (height * height);

        return result;
    }
}
