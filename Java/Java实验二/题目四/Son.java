public class Son extends Father {
    public int f(int a,int b){
        int max = super.f(a,b);
        return (a * b) / max;
    }
}
