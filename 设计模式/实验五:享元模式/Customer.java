public class Customer implements Web {
    Web aWeb;

    String name;

    public Customer(){}

    public Customer(String name,Web aWeb){
        this.name = name;
        this.aWeb = aWeb;
    }

    public void show() {
        System.out.print("客户"+name+":");
        aWeb.show();
    }
}
