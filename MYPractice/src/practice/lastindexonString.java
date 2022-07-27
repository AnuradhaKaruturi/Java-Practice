package practice;
public class lastindexonString {
	public static void main(String[] args) {		 
		String str = "This is of last index of example";
		int in = str.lastIndexOf("of");
		System.out.println(in);
		int index = str.lastIndexOf("of", 25);
		System.out.println(index);
		index = str.lastIndexOf("of", 10);
		System.out.println(index); // -1, if not found		
	}
}
