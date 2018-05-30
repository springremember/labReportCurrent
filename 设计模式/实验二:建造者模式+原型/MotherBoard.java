public class MotherBoard implements Cloneable{
    private String CPU;
    private String RAM;

    public MotherBoard(){}

    public MotherBoard(String aCPU,String aRAM){
        CPU = aCPU;
        RAM = aRAM;
    }

    public MotherBoard clone(){
        System.out.println("主板克隆方法被调用。");
        return new MotherBoard(CPU,RAM);
    }

    public void show(){
        System.out.println("CPU为"+this.CPU);
        System.out.println("内存为"+this.RAM);
    }
}
