import java.io.*;

public class Spring {
    public static void main(String[] args) {
        Student hmc = new Student();
        hmc.setName("hmc");
        hmc.setAge(21);
        hmc.setAddress("合肥",231500);
        File file = new File("student.txt");
        try (FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        FileInputStream fileIn = new FileInputStream(file);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn)){
            objectOut.writeObject(hmc);
            objectOut.flush();
            Student spring = (Student)objectIn.readObject();

            System.out.println("姓名："+spring.getName());
            System.out.println("年龄："+spring.getAge());
            System.out.println("地址："+spring.getAddressName());
            System.out.println("邮编："+spring.getZipCode());
        }
        catch (ClassNotFoundException e) {
            System.out.println("不能读出对象");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

class Student implements Serializable{
    String name;
    int age;
    Address addr = new Address();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAddress(String addressName,int zipCode){
        this.addr.setAddressName(addressName);
        this.addr.setZipCode(zipCode);
    }

    public String getAddressName(){
        return this.addr.getAddressName();
    }

    public int getZipCode(){
        return this.addr.getZipCode();
    }
}

class Address implements Serializable{
    String addressName;
    int zipCode;

    public void setAddressName(String addressName){
        this.addressName = addressName;
    }

    public String getAddressName(){
        return this.addressName;
    }

    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }

    public int getZipCode(){
        return this.zipCode;
    }
}
