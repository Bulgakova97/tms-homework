public class Lesson13 {
    import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

    public class StreamExample {
        public static void main(String[] args) {
            // Создаем коллекцию ArrayList и наполняем ее рандомными элементами типа Integer
            List<Integer> numbers = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                numbers.add(random.nextInt(100));
            }

            // Удаляем дубликаты
            List<Integer> distinctNumbers = numbers.stream()
                    .distinct()
                    .collect(Collectors.toList());

            // Выводим все четные элементы в диапазоне от 7 до 17
            List<Integer> evenNumbersInRange = distinctNumbers.stream()
                    .filter(num -> num >= 7 && num <= 17 && num % 2 == 0)
                    .collect(Collectors.toList());

            // Умножаем каждый элемент на 2
            List<Integer> doubledNumbers = evenNumbersInRange.stream()
                    .map(num -> num * 2)
                    .collect(Collectors.toList());

            // Сортируем и выводим первые 4 элемента
            List<Integer> sortedFirstFour = doubledNumbers.stream()
                    .sorted()
                    .limit(4)
                    .collect(Collectors.toList());

            // Выводим количество элементов в стриме
            long count = sortedFirstFour.stream().count();

            // Выводим среднее арифметическое всех чисел в стриме
            double average = doubledNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);

            // Вывод результатов
            System.out.println("Уникальные элементы: " + distinctNumbers);
            System.out.println("Четные элементы в диапазоне от 7 до 17: " + evenNumbersInRange);
            System.out.println("Умноженные на 2: " + doubledNumbers);
            System.out.println("Первые 4 элемента после сортировки: " + sortedFirstFour);
            System.out.println("Количество элементов в стриме: " + count);
            System.out.println("Среднее арифметическое: " + average);
        }
    }
}
