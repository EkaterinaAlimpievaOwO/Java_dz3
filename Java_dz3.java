import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

// ------------------------------------------------------------------
public class Java_dz3 {
    public static void main(String[] args) {
        // Exercise1();
        // Exercise2();
        Exercise3();
    }

    // ------------------------------------------------------------------
    // Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void Exercise1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Исходный список: " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println("Список без четных чисел: " + numbers);
    }

    // ------------------------------------------------------------------
    // Задан целочисленный список ArrayList.
    // Найти минимальное, максимальное и среднее арифметическое из этого списка.
    // Collections.max()
    public static void Exercise2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int minValue = Collections.min(list);

        int maxValue = Collections.max(list);

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double averageValue = sum / list.size();

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Average value: " + averageValue);
    }

    // ------------------------------------------------------------------
    // Заполнить список названиями планет Солнечной системы в произвольном порядке с
    // повторениями.
    // Вывести название каждой планеты и количество его повторений в списке.
    public static void Exercise3() {
        List<String> planetOptions = new ArrayList<>(
                Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"));
        List<String> planets = new ArrayList<>();
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество планет для рандомного заполнения: ");
        int planetCount = scanner.nextInt();

        for (int i = 0; i < planetCount; i++) {
            int planetIndex = random.nextInt(8);
            String planet = planetOptions.get(planetIndex);
            planets.add(planet);
        }

        List<String> uniquePlanets = new ArrayList<>();
        List<Integer> planetCounts = new ArrayList<>();

        for (String planet : planets) {
            int planetIndex = uniquePlanets.indexOf(planet);
            if (planetIndex >= 0) {
                int count = planetCounts.get(planetIndex);
                planetCounts.set(planetIndex, count + 1);
            } else {
                uniquePlanets.add(planet);
                planetCounts.add(1);
            }
        }

        System.out.println("Список планет: ");
        for (String planet : planets) {
            System.out.print(planet + ", ");
        }
        System.out.println();

        for (int i = 0; i < uniquePlanets.size(); i++) {
            System.out.println(uniquePlanets.get(i) + ": " + planetCounts.get(i));
        }
    }
}