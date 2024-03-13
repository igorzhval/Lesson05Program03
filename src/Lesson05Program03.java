import java.util.Arrays;
import java.util.Random;
public class Lesson05Program03 {
    public static void main(String[] args) {
        int teamSize = 25;
        int[] team1Ages = generateRandomAges(teamSize);
        int[] team2Ages = generateRandomAges(teamSize);
        System.out.println("Team 1 ages: " + Arrays.toString(team1Ages));
        System.out.println("Team 1 average age: " + calculateAverageAge(team1Ages));
        System.out.println("\nTeam 2 ages: " + Arrays.toString(team2Ages));
        System.out.println("Team 2 average age: " + calculateAverageAge(team2Ages));
    }
    private static int[] generateRandomAges(int size) {
        Random random = new Random();
        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
            ages[i] = random.nextInt(23) + 18;
        }
        return ages;
    }
    private static double calculateAverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}