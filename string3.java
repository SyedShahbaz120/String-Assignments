package StringAssignments;

public class string3 {

	public static void main(String[] args) {
		String s1 = "Java string pool refers to collection of strings which are stored in heap memory";
			String s1_lower = s1.toLowerCase();
			System.out.println(s1_lower);
			String s1_upper = s1.toUpperCase();
			System.out.println(s1_upper);
			String replaceString = s1.replace('a' , '$');
			System.out.println(replaceString);
			System.out.println(s1.contains("collection")); //boolean output
			String s2 = "java string pool refers to collection of strings which are stored in heap memory";
			System.out.println(s1.equals(s2));
			String s3 ="hello";
			String s4 = "Hello";
			System.out.println(s3.equalsIgnoreCase(s4));
			
	}

}
