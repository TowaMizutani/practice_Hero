
public class BankAccount {
	// ① フィールドを private にして外部から直接アクセスできないようにする
	private int balance;
	
	 final int kinnri = 10;

	// コンストラクタ
	public BankAccount(int balance) { // new BankAccount(1000); の記述のタイミングで呼ばれるメソッドのため、引数は1000となる
        
		this.balance = balance;// フィールド変数 = 仮引数

	}
	// ② getter: 残高を確認するメソッド
	public int getBalance() {
		return balance;
	}
	// ③ 入金メソッド
	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("入金額は正の数で指定してください");
		}
	}

	// ④ 出金メソッド（残高不足チェックあり）
	public void withdraw(int amount) {
		if (amount <= 0) {
			System.out.println("出金額は正の数で指定してください");
		} else if (amount > balance) {
			System.out.println("残高不足です");
		} else {
			balance -= amount;
		}
	}
}
