public class Fraction {
    private int x;
    private int y;

    public Fraction(){}

    public Fraction(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Fraction add(Fraction f){
        int newX = this.x * f.y + f.x * this.y;
        int newY = this.y * f.y;
        return new Fraction(newX,newY);
    }

    public Fraction sub(Fraction f){
        int newX = this.x * f.y - f.x * this.y;
        int newY = this.y * f.y;
        return new Fraction(newX,newY);
    }

    public Fraction mul(Fraction f){
        int newX = this.x * f.x;
        int newY = this.y * f.y;
        return new Fraction(newX,newY);
    }

    public Fraction div(Fraction f){
        int newX = this.x * f.y;
        int newY = this.y * f.x;
        return new Fraction(newX,newY);
    }

    public void show(){
        double tempX = x;
        double tempY = y;
        System.out.println("分数形式："+x+"/"+y+",浮点数形式："+tempX/tempY);
    }
}
