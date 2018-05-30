class  Test {
    public static void main(String[] args) {
        //获取工厂对象
        Factory hmc = Factory.getFactory();

        //创建用户表的mysql对象
        hmc = new UserFactory();
        Table test = hmc.createMysqlTable();
        test.query("hello");

        //创建项目表的sql对象
        hmc = new ProjectFactory();
        test = hmc.createSqlTable();
        test.add("hi");
    }
}
