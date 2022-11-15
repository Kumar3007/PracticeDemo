package CoreJavaForAT;
/*
 * Note-->
 * V1_abstractionParentAirCraft d = new V1_abstractionParentAirCraft();
 *		We can create obj for Abstract Class(We cannot instantiate object for Abstract class)
 *ChildClasses are forced to implement abstract class
 */
public class V2_childEmirites extends V1_AbstractionParentAirCraft {

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("red color on the body");
	}
		
	
	public static void main(String[] args) {
			V2_childEmirites c = new V2_childEmirites();
			c.engine();
			c.bodyColor();
			c.safetyGuidelines();
			
		
			//V1_abstractionParentAirCraft d = new V1_abstractionParentAirCraft();
			//We can create obj for Abstract Class
	}
	
	
	
}
