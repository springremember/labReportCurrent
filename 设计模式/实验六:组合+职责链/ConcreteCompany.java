import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> childrenCompany = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        upLevel();
        childrenCompany.add(company);
        company.father = this;
    }

    @Override
    public void addLevel() {
        level ++;
        if (father != null) {
            father.addLevel();
        }
    }

    @Override
    public void upLevel() {
        if (childrenCompany.size() == 2) {
            level ++;
            if (father != null) {
                father.addLevel();
            }
        }
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
        company.father = null;
    }

    @Override
    public void raiseMoney(int money){
        if (money <= level * 1000) {
            System.out.println(name+"通过批准");
        }
        else {
            if (father == null) {
                System.out.println("总部不予批准");
            }
            else {
                father.raiseMoney(money);
            }
        }
    }

}
