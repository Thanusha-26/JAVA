abstract class ATM
{
	abstract void withdraw(double amount);
	abstract void checkBalance();
}
class SBIATM extends ATM
{
	void withdraw(double amount) {
		System.out.println("Withdrawing: " + amount);
	}
	void checkBalance() {
		System.out.println("Balance is 10,000");
	}
}

public class TestATM
{
	public static void main(String[] args)
	{
		ATM a=new SBIATM();   // Abstraction
		a.withdraw(2000);
		a.checkBalance();
	}
}