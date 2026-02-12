package LoopStatememnts;

public class For_Each_Loop {

	public static void main(String[] args) {
		String[] names = {"Java", "c", "C++", "selenium", "JavaScript"};
		System.out.println("Printing the content of the array names: \n");
		
		for (String name: names)
		{
			System.out.println(name);
		}

	}

}
