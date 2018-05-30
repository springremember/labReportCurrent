public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id,double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getRate(){
        return annualInterestRate;
    }

    public void setRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12;
    }

    public String withDraw(double money){
        if (money > balance) {
            return "余额不足";
        }
        else {
            balance = balance - money;
            return "成功取钱";
        }
    }

    public void deposit(double money){
        balance = balance + money;
    }
}

class Test {
    public static void main(String[] args) {
        Account hmc = new Account(1122, 20000);
        hmc.setRate(4.5);
        System.out.println(hmc.withDraw(2500));
        hmc.deposit(3000);
        System.out.println("余额："+hmc.getBalance());
        System.out.println("月利息："+hmc.getMonthlyInterestRate());
    }
}
