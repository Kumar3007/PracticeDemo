package CoreJavaForAT;
/*
 * Scenario---->Census Report in a City from Central government
 */
public class V4_StaticVar2 {
	//instance variables---1
	String name;
	String address;
	static String city="Mysore";//class variable
	static int i=0;
							//local variables-->scope is inside this block only---3
	public V4_StaticVar2(String name,String address)		//this constructor is automatically called when we create Object
	{
		//now Assign local variables to instance variables----4
		
		
		this.name=name;
//this refer to the instance variables present in your class=local variable
		this.address=address;
		i++;
		System.out.println(i);
		
	}
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	
	public static void main(String[] args) {
		V4_StaticVar2 a = new V4_StaticVar2("Bob","Hebbal"); //explicit constructor is invoked----2
		V4_StaticVar2 b = new V4_StaticVar2("sam", "Jayanagar");//when we create an Object.., Constructor is called automatically
		a.getAddress();
		b.getAddress();
		
	}
	
	

}
