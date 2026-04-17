//Katherine (Katie) Kilborn
public class CourseLLNode {
	public int id;
	public String name;
	public boolean complete;
	public CourseLLNode next;
	
	//coursellnode class
	public CourseLLNode(int id, String name) {
		this.id=id;
		this.name=name;
		this.complete=false;
		this.next=null;
	}
	//setters and getters
	public void setNext(CourseLLNode next) {
		this.next=next;
	}
	public CourseLLNode getNext() {
		return next;
	}
	public void completed() {
		this.complete=true;
	}
	public boolean isCompleted() {
		return complete;
	}
	public String getName() {
		return name;
	}
	private CourseLLNode head;
	public void add(String course, int id) {
		
	}
	//checks if the course has been completed
	public void isComplete(String course) {
		CourseLLNode current=head;
		while (current!=null) {
			if (current.getName().equalsIgnoreCase(course)) {
				current.completed();
			}
			else {
				current=current.getNext();
			}
		}
	}
}
