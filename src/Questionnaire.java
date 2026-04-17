//Katherine (Katie) Kilborn
import java.util.Scanner;

public class Questionnaire {
	CourseLLNode head;
	private int nextID=0;
	
	//add method
	public void add(String name) {
		CourseLLNode newNode = new CourseLLNode(nextID++, name);
		CourseLLNode current=head;
		if (head == null) {
			head=newNode;
		}
		else {
			while (current.next != null) {
				current = current.next;
			}
			current.next=newNode;
		}
	}
	//marks classes complete after user inputs completed courses
	public boolean markComplete(String name) {
		CourseLLNode current=head;
		while (current != null) {
			if (current.name.trim().equalsIgnoreCase(name.trim())) {
				current.complete=true;
				return true;
			}
			current=current.next;
		}
		return false;
	}
	//if the user completed all the courses, it will print that all courses have been completed
	public void printIncomplete() {
		CourseLLNode current=head;
		boolean printedAny=false;
		while (current!=null) {
			if(!(current.complete)) {
				System.out.println(current.name);
				printedAny=true;
			}
			current=current.next;
		}
		if (!(printedAny)) {
			System.out.println("You have completed all the courses required!!");
		}
	}
	//prints completed courses
	public void printComplete() {
		CourseLLNode current=head;
		boolean printedAny=false;
		while (current!=null) {
			if(current.complete) {
				System.out.println(current.name);
				printedAny=true;
			}
			current=current.next;
		}
		if (!(printedAny)) {
			System.out.println("You haven't completed any of the courses yet.");
		}
	}
}
