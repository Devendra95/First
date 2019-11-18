package demopackage;

class PatternDemo 
{ 
	public static void main(String args[]) 
	{ 
		String email = "देव@योगा.भारत ";
	   // String email="deven@gmail.com";
		System.out.println("The E-mail ID is: " + email);
		String regex = "^[^\\w-_\\.+]*[^\\w-_\\.]\\@([^\\w]+\\.)+[^\\w]+[^\\w]$";
	    System.out.println("Is the above E-mail ID valid? " + email.matches(regex));
	    
		/*System.out.println("అనువాద".matches("[\\pL\\pM]+"));
		System.out.println("स्वागत".matches("[\\pL\\pM]+"));
		//L for letter category and M for mark category because स्वा consider as a one character(letter and mark)
		
		System.out.println("स्वागत".matches("[\\p{L}\\pM]+"));
		//for match a single character with belonging to "letter" category
		System.out.println("நல்வரவு".matches("[\\pL\\pM]+"));
		*/
	} 
}
