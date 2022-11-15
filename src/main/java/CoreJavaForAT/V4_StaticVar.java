package CoreJavaForAT;
/*
 * Scenario---->Census Report in a City from Central government
 */
public class V4_StaticVar {
	//instance variables---1
	String name;
	String address;
	String city;
							//local variables-->scope is inside this block only---3
	public V4_StaticVar(String name,String address,String city)		//this constructor is automatically called when we create Object
	{
		//now Assign local variables to instance variables----4
		
		
		this.name=name;
//this refer to the instance variables present in your class=local variable
		this.address=address;
		this.city=city;
		
	}
	
	public void getAddress()
	{
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		V4_StaticVar a = new V4_StaticVar("Bob","Hebbal","Mysore"); //explicit constructor is invoked----2
		V4_StaticVar b = new V4_StaticVar("sam", "Jayanagar", "mysore");//when we create an Object.., Constructor is called automatically
		a.getAddress();
		b.getAddress();
	}
	
	

}
