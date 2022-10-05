package Ex2;

public class Wallet {
	private int money;

	public Wallet() {
	}

	public Wallet(int money) {
		super();
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean Payment(int total) {
		if (total < getMoney()) {
			return true;
		} else {
			return false;
		}
	}
}
