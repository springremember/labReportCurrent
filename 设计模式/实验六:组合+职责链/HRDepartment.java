public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {}

    @Override
    public void remove(Company company) {}

    @Override
    public void raiseMoney(int money){
        father.raiseMoney(money);
    }

    @Override
    public void addLevel() {}

    @Override
    public void upLevel() {}
}
