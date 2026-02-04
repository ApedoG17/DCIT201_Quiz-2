public class GradeReport {

public static boolean validateScore(double score) {
    return score >= 0 && score <= 100;
}

public static char calculateLetterGrade(double score) {
    if (score >= 90) return 'A';
    if (score >= 80) return 'B';
    if (score >= 70) return 'C';
    if (score >= 60) return 'D';
    return 'F';

}

public static void displayPerformanceMessage(char grade) {
    System.out.print("Your grade is: " + grade + ". ");
}

public static void executeGradeReport(double score) {

    // Step 1: Validate the score
    if (!validateScore(score)) {
        System.out.println("Invalid Score");
        return; // stop execution
    }

    // Step 2: Calculate the letter grade
    char grade = calculateLetterGrade(score);

    // Step 3: Display performance message
    displayPerformanceMessage(grade);
}

public static void main(String[] args) {
    System.out.println("--- Test 1: Good Score ---");
    executeGradeReport(56.0); 

    System.out.println("\n--- Test 2: Bad Score ---");
    executeGradeReport(101.0); // Should print "Invalid Score"
}

}