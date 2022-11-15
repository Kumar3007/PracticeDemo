package TestYantra;

public class reverseString {
	public static void main(String[] args)
	 {
	 String str="java is wonderful language";
	 
	 String[] s=str.split(" ");
	
	 for(int i=s.length-1;i>=0;i--)
	 {
	 System.out.print(s[i]+" ");
	 }
	
	
	}

}
