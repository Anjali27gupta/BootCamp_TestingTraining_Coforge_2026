package Assignment4;
// WAP in Java using Constructor  use variable fields like webname , webage, studying
public class Website {
	String webname;
	int webage;
	String studying;
	
	Website(String name, int age, String university) {
		this.webname= name;
		this.webage= age;
		this.studying=university;
	}

	public static void main(String[] args) {
		Website obj1 = new Website("Larry page and Sergey Brin", 28, "Standford University");
		Website obj2 = new Website("https://www.google.com/", 28, "Standford University");
		System.out.println(obj1.webname+ " founded google and google is now "+obj1.webage+" years old. They were studying in  "+obj1.studying);
		System.out.println(obj2.webname+ " "+obj2.webage+" "+obj2.studying);
	}

}