class Test {
    public static void main(String[] args) {
        int a =15;
        int b =12;
        F Hacky = new Max();
        int max = Hacky.f(a,b);
        System.out.println("公约数为"+max);

        System.out.println("");

        Hacky = new Min();
        int min = Hacky.f(a,b);
        System.out.println("公倍数为"+min);
    }
}
