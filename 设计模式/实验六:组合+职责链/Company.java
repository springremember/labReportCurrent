public abstract class Company {
    // 成员变量
    protected String name;
    public int level = 1;
    public Company father = null;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company company);//add
    public abstract void remove(Company company);//remove
    public abstract void raiseMoney(int money); //请求加薪
    public abstract void upLevel(); //带判断增加等级
    public abstract void addLevel(); //直接增加等级
}
