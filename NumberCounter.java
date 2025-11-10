		import java.util.Scanner; 

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
 
		
        int number;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        System.out.println("Enter numbers (enter -1 to stop):");
        
        while (true) {
            number = input.nextInt();
            
            if (number == -1) {
                break;
            }
            
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Total Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
        System.out.println("Total Zeros: " + zeroCount);
        
        input.close();
    }
}
