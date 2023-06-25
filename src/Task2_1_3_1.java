import java.util.function.Function;

public class Task2_1_3_1 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tНаписать лямбда выражение, которое принимает на вход число и возвращает " +
                "\nзначение “Положительное число”, “Отрицательное число” или  “Ноль”. Используем " +
                "\nфункциональный интерфейс Function\n\nРешение: ");

        Function<Integer, String> function = i -> {
            String result = "Ноль";
            if (i > 0) {
                result = "Положительное число";
            } else if (i < 0) {
                result = "Отрицательное число";
            }
            return result;
        };

        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(99));
    }
}
