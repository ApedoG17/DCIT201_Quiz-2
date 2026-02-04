public class ClassAverageDemo {

    //Two double scores as parameters
    public static double calculateClassAverage(double mark1, double mark2) {
        double average = (mark1 + mark2) / 2.0;
        return average;
    }

    //Three double scores as parameters
    public static double calculateClassAverage(double mark1, double mark2, double mark3) {
        double average = (mark1 + mark2 + mark3) / 3.0;
        return average;
    }

    //Array of double scores
    public static double calculateClassAverage(double[] marks) {
        if (marks.length == 0) {
            System.out.println("No marks provided.");
            return 0.0;
        }

        double total = 0.0;

        //Looping through the array to sum up the marks
        for (double mark : marks) {
            total += mark;
        }

        return total / marks.length;
    }

    //Testing
    public static void main(String[] args) {
        System.out.println("Avg of 2 scores (80, 90): " + calculateClassAverage(80.0, 90.0));

        // Test Version 2
        System.out.println("Avg of 3 scores (80, 90, 100): " + calculateClassAverage(80.0, 90.0, 100.0));

        // Test Version 3
        double[] classScores = { 55.5, 78.0, 92.5, 88.0, 64.5 };
        System.out.println("Avg of Array: " + calculateClassAverage(classScores));
    }

}