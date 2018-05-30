public class Max extends F {
    public int f(int a,int b) {
        int max = 1;
        for (int i = 1; i <= a; i++ ) {
            if (a % i == 0 && b % i ==0) {
                max = i;
            }
        }
        return max;
    }
}
