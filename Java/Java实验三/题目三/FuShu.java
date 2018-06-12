public class FuShu {
    private double real;
    private double image;

    public FuShu(){}

    public FuShu(double real,double image){
        this.real = real;
        this.image = image;
    }

    public FuShu add(FuShu s1){
        double realSum = this.real + s1.real;
        double imageSum = this.image + s1.image;
        return new FuShu(realSum,imageSum);
    }

    public void show(){
        System.out.println("实部为"+real+",虚部为"+image);
    }
}
