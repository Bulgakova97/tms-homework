import jdk.jshell.ImportSnippet;

public class Lesson14 {
    import java.util.ArrayList;
    import java.util.List;
    import java.util.stream.Collectors;
    {
        public static void main(String[] args) {
            // Создаем коллекцию ArrayList со значениями имен студентов
            List<String> studentNames = new ArrayList<>();
            studentNames.add("Aryna");
            studentNames.add("Ilja");
            studentNames.add("Karina");
            studentNames.add("Vlad");
            studentNames.add("Alina");

            // Вернуть количество людей с вашим именем (без учета регистра)
            String myName = "Aryna";
            long countWithName = studentNames.stream()
                    .filter(name -> name.equalsIgnoreCase(myName))
                    .count();

            // Выбрать все имена, начинающиеся на "а" (без учета регистра)
            List<String> namesStartingWithA = studentNames.stream()
                    .filter(name -> name.toLowerCase().startsWith("a"))
                    .collect(Collectors.toList());

            // Отсортировать и вернуть первый элемент или "Empty@" если коллекция пуста
            String firstElement = studentNames.stream()
                    .findFirst()
                    .orElse("Empty@");

            // Вывод результатов
            System.out.println("Количество людей с именем '" + myName + "': " + countWithName);
            System.out.println("Имена, начинающиеся с 'A': " + namesStartingWithA);
            System.out.println("Первый элемент коллекции: " + firstElement);
        }
    }
}
