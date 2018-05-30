public class Test {
    public static void main(String[] args) {
        //一个总公司
        ConcreteCompany beiJing = new ConcreteCompany("北京公司总部");
        beiJing.add(new HRDepartment("人力资源部"));
        beiJing.add(new FinanceDepartment("财务部"));

        //三个子公司
        ConcreteCompany shangHai = new ConcreteCompany("上海华东分公司");
        shangHai.add(new HRDepartment("人力资源部"));
        shangHai.add(new FinanceDepartment("财务部"));
        beiJing.add(shangHai);

        ConcreteCompany nanJing = new ConcreteCompany("南京办事处");
        nanJing.add(new HRDepartment("人力资源部"));
        nanJing.add(new FinanceDepartment("财务部"));
        shangHai.add(nanJing);

        ConcreteCompany hangZhou = new ConcreteCompany("杭州办事处");
        hangZhou.add(new HRDepartment("人力资源部"));
        hangZhou.add(new FinanceDepartment("财务部"));
        shangHai.add(hangZhou);

        hangZhou.raiseMoney(1300);
        hangZhou.raiseMoney(4000);
        shangHai.raiseMoney(2100);
        beiJing.raiseMoney(1300);
    }
}
