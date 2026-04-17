//Katherine (Katie) Kilborn
public class QNode {
	public int id;
	public String Qtext;
	public QNode yes=null;
	public QNode no=null;
	public boolean ismajor;
	public String major;
	
	//creates qnode class
	public QNode(int id, String Qtext, boolean ismajor) {
		this.id=id;
		this.ismajor=ismajor;
		if (ismajor) {
			this.major=Qtext;
			this.Qtext=Qtext;
		}
		else {
			this.Qtext=Qtext;
			this.major=null;
		}
	}
	//getters
	public QNode getYes() {
		return yes;
	}
	public QNode getNo() {
		return no;
	}
	//checks if it is a leaf because that would mean it is the reccommended major
	public boolean isLeaf() {
		if (yes==null && no==null) {
			return true;
		}
		return false;
	}
	//toString returns recommended major or the question
	@Override
	public String toString() {
		if (isLeaf()) {
			return "Recommended major: " + major;
		}
		else {
			return Qtext;
		}
	}
}
