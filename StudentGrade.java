package StudentGradeCalculator;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int numOfSub = sc.nextInt();
		int totalMarks = 0;
		
		System.out.println("Enter Marks out of 100");
		for (int i = 1; i <= numOfSub; i++) {
			System.out.print("Subject " + i + ": ");
			int marks = sc.nextInt();
			totalMarks += marks;
		}
		
		sc.close();
		double avgPercentage = (double) (totalMarks) / numOfSub;
		
		char grade = calculateGrage(avgPercentage);
		System.out.println("Your Grade: "+grade);
	}
	
	public static char calculateGrage(double avgPercentage){
		if(avgPercentage>=90){
			return 'A';
		} else if (avgPercentage >= 80) {
			return 'B';
		} else if (avgPercentage >= 70) {
			return 'C';
		} else if (avgPercentage >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}