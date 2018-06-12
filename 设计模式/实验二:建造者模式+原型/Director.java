public class Director {
    Builder BD;

    public Director(){}

    public Director(Builder aBD){
        BD = aBD;
    }

    public IBM getIBM(){
        BD.buildCPU();
        BD.buildRAM();
        BD.getMB();
        BD.buildMonitor();
        BD.buildKeyboard();
        BD.buildMouse();
        IBM temp = new IBM(BD.MB,BD.monitor,BD.keyBoard,BD.mouse);
        return temp;
    }

}
