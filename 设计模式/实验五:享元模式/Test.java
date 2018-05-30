public class Test {
    public static void main(String[] args) {
        Web a = new Customer("a",WebFactory.getWeb("信息发布"));
        Web b = new Customer("b",WebFactory.getWeb("信息发布"));
        Web c = new Customer("c",WebFactory.getWeb("信息发布"));
        Web d = new Customer("d",WebFactory.getWeb("产品展示"));
        Web e = new Customer("e",WebFactory.getWeb("产品展示"));
        Web f = new Customer("f",WebFactory.getWeb("产品展示"));
        Web g = new Customer("g",WebFactory.getWeb("博客留言"));
        Web h = new Customer("h",WebFactory.getWeb("博客留言"));
        Web i = new Customer("i",WebFactory.getWeb("博客留言"));
        Web j = new Customer("j",WebFactory.getWeb("博客留言"));

        a.show();
        b.show();
        WebFactory.showSize();
    }
}
