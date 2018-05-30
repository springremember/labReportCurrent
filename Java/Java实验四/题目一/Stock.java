public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(){}

    public Stock(String symbol,String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        double temp = (currentPrice - previousClosingPrice) / previousClosingPrice;
        return temp * 100;
    }

    public void setPre(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrent(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}

class Test {
    public static void main(String[] args) {
        Stock hmc = new Stock("ORCL","Oracle Corporation");
        hmc.setPre(34.5);
        hmc.setCurrent(34.35);
        System.out.println("百分比变化："+hmc.getChangePercent());
    }
}
