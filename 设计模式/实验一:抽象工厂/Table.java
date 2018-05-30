//Table父类,用于指向子类对象
public abstract class Table{
    abstract void query(String in);

    abstract void add(String in);
}

//用户表Mysql
class UserTableForMysql extends Table{
    public void query(String in){
        System.out.println("user和mysql的查询函数");
    }

    public void add(String in){
        System.out.println("user和mysql的添加函数");
    }
}

//用户表sql
class UserTableForSql extends Table{
    public void query(String in){
        System.out.println("user和sql的查询函数");
    }

    public void add(String in){
        System.out.println("user和sql的添加函数");
    }
}

//部门表mysql
class DepartmentTableForMysql extends Table{
    public void query(String in){
        System.out.println("department和mysql的查询函数");
    }

    public void add(String in){
        System.out.println("department和mysql的添加函数");
    }
}

//部门表sql
class DepartmentTableForSql extends Table{
    public void query(String in){
        System.out.println("department和sql的查询函数");
    }

    public void add(String in){
        System.out.println("departmentt和sql的添加函数");
    }
}

//项目表mysql
class ProjectTableForMysql extends Table{
    public void query(String in){
        System.out.println("project和mysql的查询函数");
    }

    public void add(String in){
        System.out.println("project和mysql的添加函数");
    }
}

//项目表sql
class ProjectTableForSql extends Table{
    public void query(String in){
        System.out.println("project和sql的查询函数");
    }

    public void add(String in){
        System.out.println("projectt和sql的添加函数");
    }
}
