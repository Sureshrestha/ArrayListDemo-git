package AccessModifiers;

public class TestAccessModifier 
{
	public static void main(String[] args) 
	{
		PrivateModifier pm = new PrivateModifier();
		PublicModifier puM = new PublicModifier();
		DefaultNodifier dM = new DefaultNodifier();
		ProtectedModifier prM = new ProtectedModifier();
	
		puM.shoInfo();
		dM.shoInfo();
		//prM.shoInfo();
		//pm.shoInfo();
	}
	
	

}
