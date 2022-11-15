//Encapsulation
package OppsConcept;

public class Account {
		
		private double balance=50000;
		public double getBalance()
		{
			return this.balance;
		}
		
		public void withdraw(int amount)
		{
			this.balance=this.balance-amount;
		}
		
		public void deposite(int amount)
		{
			this.balance=this.balance+amount;
		}
}

class account_driver
{
	public static void main(String[] args) {
		Account ob = new Account();
		System.out.println(ob.getBalance());
		
		ob.withdraw(60000);
		System.out.println(ob.getBalance());
		
		ob.deposite(15000);
		System.out.println(ob.getBalance());
	}
}