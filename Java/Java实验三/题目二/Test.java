public class Test {
    public static void main(String[] args) {
        Employee hmc = new Employee(119,"何铭春","男",1,3000,500,600,800);
        System.out.println("何铭春实发工资:"+hmc.calculate());
        System.out.println("何铭春所有信息为：");
        System.out.println(hmc);
    }
}
