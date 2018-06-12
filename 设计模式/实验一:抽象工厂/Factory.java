//工厂类定义，实现了单件模式
class Factory{
    public static Factory spring = null;

    protected Factory(){
    }

    public static Factory getFactory(){
        if (spring == null) {
            spring = new Factory();
        }
        return spring;
    }

    public Table createMysqlTable(){
        return null;
    }

    public Table createSqlTable(){
        return null;
    }
}

//用户表工厂
class UserFactory extends Factory{
    public Table createSqlTable(){
        return new UserTableForSql();
    }

    public Table createMysqlTable(){
        return new UserTableForMysql();
    }
}

//部门表工厂
class DepartmentFactory extends Factory{
    public Table createSqlTable(){
        return new DepartmentTableForSql();
    }

    public Table createMysqlTable(){
        return new DepartmentTableForMysql();
    }
}

//项目表工厂
class ProjectFactory extends Factory{
    public Table createSqlTable(){
        return new ProjectTableForSql();
    }

    public Table createMysqlTable(){
        return new ProjectTableForMysql();
    }
}
