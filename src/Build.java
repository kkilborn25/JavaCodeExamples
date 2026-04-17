//Katherine (Katie) Kilborn
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Build {
	//creates BST with all the questions and majors
	public static QNode createBST() {
		QNode root=new QNode(1, "Do you like science?", false);
		QNode q2=new QNode(2, "Do you enjoy caring for others?", false);
		QNode q3=new QNode(3, "Do you enjoy math?", false);
		QNode q4=new QNode(4, "Do you want to work with patient drugs?", false);
		QNode q5=new QNode(5, "Do you enjoy the outdoors?", false);
		QNode q6=new QNode(6, "Do you enjoy talking with others?", false);
		QNode q7=new QNode(7, "Do you like working with computers?", false);
		QNode q8=new QNode(8, "Are you okay being in school for over four years?", false);
		QNode q9=new QNode(9, "Do you enjoy doing labs?", false);
		QNode q10=new QNode(10, "Do you enjoy helping others learn?", false);
		QNode q11=new QNode(11, "Do you like working with computer hardware?", false);
		QNode q12=new QNode(12, "Do you like hands on work?", false);
		QNode q13=new QNode(13, "Do you want to work with athletics?", false);
		QNode q14=new QNode(14, "Do you enjoy working with living organisms?", false);
		QNode q15=new QNode(15, "Do you enjoy working with computer security?", false);
		QNode q16=new QNode(16, "Do you enjoy working with eletrical components?", false);
		QNode pharm=new QNode(18, "Pharmaceutical Sciences", true);
		QNode es=new QNode(19, "Environmental Science", true);
		QNode engl=new QNode(20, "English", true);
		QNode premed=new QNode(21, "Pre-Med", true);
		QNode phy=new QNode(22, "Physics", true);
		QNode psych=new QNode(23, "Psychology", true);
		QNode elmed=new QNode(24, "Elementary Education", true);
		QNode ce=new QNode(25, "Computer Engineering", true);
		QNode math=new QNode(26, "Mathematics", true);
		QNode nursing=new QNode(27, "Nursing", true);
		QNode exs=new QNode(28, "Exercise Science", true);
		QNode chem=new QNode(29, "Chemistry", true);
		QNode bio=new QNode(30, "Biological Sciences", true);
		QNode cs=new QNode(31, "Computer Science", true);
		QNode cyber=new QNode(31, "Cyber Policy and Ethics", true);
		QNode ee=new QNode(32, "Electrical Engineering", true);
		QNode me=new QNode(33, "Mechanical Engineering", true);
		
		//links the questions to the next questions in the sequence or the recommended major is it is linked to a leaf
		root.yes=q2;
		root.no=q3;
		q2.yes=q4;
		q2.no=q5;
		q3.yes=q7;
		q3.no=q6;
		q4.yes=pharm;
		q4.no=q8;
		q5.yes=es;
		q5.no=q9;
		q6.yes=q10;
		q6.no=engl;
		q7.yes=q11;
		q7.no=q12;
		q8.yes=premed;
		q8.no=q13;
		q9.yes=q14;
		q9.no=phy;
		q10.yes=elmed;
		q10.no=psych;
		q11.yes=ce;
		q11.no=q15;
		q12.yes=q16;
		q12.no=math;
		q13.yes=exs;
		q13.no=nursing;
		q14.yes=bio;
		q14.no=chem;
		q15.yes=cyber;
		q15.no=cs;
		q16.yes=ee;
		q16.no=me;
		return root;
	}
	//Hashmap of classes required for each major
	public static Map<String, Questionnaire> buildMajorMap(){
		Map<String, Questionnaire> map=new HashMap<>();
		Questionnaire pharm = new Questionnaire();
		pharm.add("PHMY 657");
		pharm.add("PHMY 690");
		pharm.add("PHMY 750");
		pharm.add("PHMY 700");
		pharm.add("PHMY 722");
		pharm.add("PHMY 772");
		map.put("Pharmaceutical Sciences", pharm);
		
		Questionnaire es = new Questionnaire();
		es.add("ENVR 101");
		es.add("ENVR 201");
		es.add("GEOL 101");
		es.add("ENVR 202");
		es.add("MSCI 305");
		es.add("PHYS 201");
		map.put("Environmental Science", es);
		
		Questionnaire engl = new Questionnaire();
		engl.add("ENGL 101");
		engl.add("ENGL 102");
		engl.add("ENGL 287");
		engl.add("ENGL 288");
		engl.add("ENGL 370");
		engl.add("ENGL 457");
		map.put("English", engl);
		
		Questionnaire premed = new Questionnaire();
		premed.add("CHEM 111");
		premed.add("CHEM 112");
		premed.add("BIOL 101");
		premed.add("BIOL 102");
		premed.add("PHYS 201");
		premed.add("PHYS 202");
		map.put("Pre-Med", premed);
		
		Questionnaire phy = new Questionnaire();
		phy.add("PHYS 199");
		phy.add("PHYS 211");
		phy.add("PHYS 212");
		phy.add("PHYS 307");
		phy.add("PHYS 306");
		phy.add("PHYS 501");
		map.put("Physics", phy);
		
		Questionnaire elmed = new Questionnaire();
		elmed.add("EDEL 306");
		elmed.add("EDTE 500");
		elmed.add("ARTE 520");
		elmed.add("ISCI 325");
		elmed.add("EDEL 430");
		elmed.add("EDEL 491");
		map.put("Elementary Education", elmed);
		
		Questionnaire psych = new Questionnaire();
		psych.add("PSYC 101");
		psych.add("PSYC 120");
		psych.add("PSYC 220");
		psych.add("PSYC 221");
		psych.add("ENGL 101");
		psych.add("BIOL 101");
		map.put("Psychology", psych);
		
		Questionnaire ce = new Questionnaire();
		ce.add("CSCE 145");
		ce.add("CSCE 190");
		ce.add("CSCE 146");
		ce.add("CSCE 211");
		ce.add("CSCE 212");
		ce.add("CSCE 240");
		map.put("Computer Engineering", ce);
		
		Questionnaire math = new Questionnaire();
		math.add("MATH 141");
		math.add("MATH 142");
		math.add("MATH 241");
		math.add("MATH 300");
		math.add("MATH 544");
		math.add("MATH 546");
		map.put("Mathematics", math);
		
		Questionnaire exs = new Questionnaire();
		exs.add("EXSC 191");
		exs.add("EXSC 223");
		exs.add("EXSC 351");
		exs.add("EXSC 330");
		exs.add("EXSC 335");
		exs.add("EXSC 444");
		map.put("Exercise Science", exs);
		
		Questionnaire nursing = new Questionnaire();
		nursing.add("NURS 112");
		nursing.add("NURS 208");
		nursing.add("NURS 216");
		nursing.add("NURS 220");
		nursing.add("NURS 311");
		nursing.add("NURS 312");
		map.put("Nursing", nursing);
		
		Questionnaire bio = new Questionnaire();
		bio.add("BIOL 101");
		bio.add("BIOL 102");
		bio.add("BIOL 301");
		bio.add("BIOL 302");
		bio.add("BIOL 303");
		bio.add("CHEM 111");
		map.put("Biological Sciences", bio);
		
		Questionnaire chem = new Questionnaire();
		chem.add("CHEM 141");
		chem.add("CHEM 142");
		chem.add("CHEM 333");
		chem.add("CHEM 322");
		chem.add("CHEM 334");
		chem.add("CHEM 550");
		map.put("Chemistry", chem);
		
		Questionnaire cyber = new Questionnaire();
		cyber.add("CYBR 393");
		cyber.add("CYBR 390");
		cyber.add("CYBR 498");
		cyber.add("CYBR 499");
		cyber.add("ISCI 201");
		cyber.add("CSCE 102");
		map.put("Cyber Policy and Ethics", cyber);
		
		Questionnaire cs = new Questionnaire();
		cs.add("CSCE 145");
		cs.add("CSCE 146");
		cs.add("CSCE 190");
		cs.add("CSCE 215");
		cs.add("CSCE 211");
		cs.add("CSCE 240");
		map.put("Computer Science", cs);
		
		Questionnaire ee = new Questionnaire();
		ee.add("ELCT 101");
		ee.add("ELCT 102");
		ee.add("ELCT 221");
		ee.add("ELCT 201");
		ee.add("ELCT 222");
		ee.add("ELCT 363");
		map.put("Electrical Engineering", ee);
		
		Questionnaire me = new Questionnaire();
		me.add("EMCH 101");
		me.add("EMCH 111");
		me.add("EMCH 200");
		me.add("EMCH 201");
		me.add("EMCH 220");
		me.add("EMCH 310");
		map.put("Mechanical Engineering", me);
		
		return map;
		}
	//asks the questions and expects yes or no answers
	public static String questions(QNode root) {
		Scanner scan=new Scanner(System.in);
		QNode current=root;
		while(!current.isLeaf()) {
			String question=null;
			if (current.Qtext != null) {
				question=current.Qtext;
			}
			else if (current.major != null) {
				question=current.major;
			}
			else {
				question="An error has occured. Please try again";
			}
			System.out.println(question);
			String yon=scan.nextLine().toLowerCase();
			if(yon.equals("yes")) {
				current=current.yes;
			}
			else if (yon.equals("no")) {
				current=current.no;
			}
			else {
				System.out.println("Please only enter 'yes' or 'no'");
			}
		}
		return current.major;
		
	}
}

