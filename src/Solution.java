import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private String kiirlaktat;
        private String laktat;
            String[] lines = laktat.strip().split("\n");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate today = LocalDate.now();
        int ageLimit = 30;
        int olderThan30 = 0;
        List<Integer> budapestSalaries = new ArrayList<>();{

        

        for (String line : lines) {
            String[] parts = line.trim().split(";");
            LocalDate birthDate = LocalDate.parse(parts[3], formatter);
            int salary = Integer.parseInt(parts[4]);
            int age = Period.between(birthDate, today).getYears();

            if (age > ageLimit) {
                olderThan30++;
            }

            if (parts[1].equalsIgnoreCase("Budapest")) {
                budapestSalaries.add(salary);
            }
        }

        double averageBudapestSalary = budapestSalaries.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("30 évesnél idősebb dolgozók száma: " + olderThan30);
        System.out.println("Budapesti dolgozók átlagbére: " + (int) averageBudapestSalary + " Ft");
  }
}

