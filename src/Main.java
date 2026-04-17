//Katherine (Katie) Kilborn
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
	//main method
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		QNode root=Build.createBST();
		System.out.println("Welcome to find your major!");
		System.out.println("To begin please answer the following questions. Only applicable answers are 'yes' or 'no'");
		String recommend=Build.questions(root);
		//scan.nextLine();
		//prints the leaf
		System.out.println("Your recommended major is: " + recommend);
		//looks at hashmap to find courses required for major
		Map<String, Questionnaire> majorMap=Build.buildMajorMap();
		Questionnaire courses=majorMap.get(recommend);
		if (courses==null) {
			System.out.println("Please try again");
			scan.close();
			return;
		}
		//shows courses still needing to be completed and checks which ones have been completed
		System.out.println("Please enter the courses you have completed: (Example: MATH 141) Please enter 'done' when you have entered all completed courses.");
		String complete="";
		System.out.println("Completed courses: ");
		while(!(complete.equalsIgnoreCase("done"))){
			complete=scan.nextLine();
			if (!(complete.equalsIgnoreCase("done")))
				courses.markComplete(complete);
		}
		System.out.println("Courses left to complete: ");
		courses.printIncomplete();
		//courses.printComplete();
		System.out.println("Thank you for using find your major! Good luck in your future endevors!");	
	}
	

}
