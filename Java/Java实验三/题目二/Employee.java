public class Employee {
    public int id;
    public String name;
    public String sex;
    public int workAge;
    public double wage;
    public double transportationAllowance;
    public double lunchAllowance;
    public double bonus;

    public Employee(){}

    public Employee(int id,String name,String sex,int workAge,double wage,double transportationAllowance,double lunchAllowance,double bonus){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.workAge = workAge;
        this.wage = wage;
        this.transportationAllowance = transportationAllowance;
        this.lunchAllowance = lunchAllowance;
        this.bonus = bonus;
    }

    public double calculate(){
        double sum = 0;
        sum = wage + transportationAllowance + lunchAllowance + bonus;
        return sum;
    }

    public String toString(){
        return "职工号:"+id+",姓名:"+name+",性别:"+sex+",工龄:"+workAge+",基本工资:"+wage+",交通补贴:"+transportationAllowance+",午餐补助:"+lunchAllowance+",奖金:"+bonus+"。";
    }
}
