package AccessModifiers;

class PrivateModifier {
	
	private String name = "Harry";
	private int age = 18;
	
	private void shoInfo()
	{
		System.out.println("Private Access Modifier Name: " + name + " Age: " + age);
	}
	
	public static void main(String[] args) {
		PrivateModifier pM = new PrivateModifier();
		
		pM.shoInfo();
	}
	
}
