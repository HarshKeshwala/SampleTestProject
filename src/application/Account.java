package application;

public class Account {
		String _name; // represents the user name
		double _balance;

		public Account()
		{
			this("Not Set",5.00);
		}

		public Account(String newName, double newBalance)
		{
			this._name = newName;
			this._balance = newBalance;
		}
		//getter for name

		public String getName()
		{
			return this._name;
		}

		//setter for name

		public void setName(String newName)
		{
			this._name = newName;
		}

		//getter for balance

		public double getBalance()
		{
			return this._balance;
		}

		public void setBalance(double newBalance)
		{
			this._balance = newBalance;
		}
}
