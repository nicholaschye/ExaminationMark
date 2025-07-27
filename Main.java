import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Examination Mark Calculator ====");
        System.out.print("Enter number of subjects: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        
        String[] parts = new String[num];
        double[] percentages = new double[num];
        String[] subjectName = new String[num];
        
        int highest_index = 0;

        
       
        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter subject " + (i + 1) + ": ");
            parts[i] = scanner.nextLine();
            String[] subjects = parts[i].split(",\\s*");
            subjectName[i] = subjects[0];
            
            String[] marks = subjects[1].split("/");
            int number = Integer.parseInt(marks[0].trim());
            int denom = Integer.parseInt(marks[1].trim());
            
            percentages[i] = (number * 100.0) / denom;

            System.out.println("Subject name: " + subjectName[i]);
            System.out.printf("Marks: %d/%d\n", number, denom);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);

            if (percentages[i] > percentages[highest_index]) {
                highest_index = i;
            }

            System.out.println(); 
        }
        
        System.out.println("Highest Scoring Subject: " + subjectName[highest_index]);
    }
}
