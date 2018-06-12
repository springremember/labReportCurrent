abstract class Builder {
    String CPU;
    String RAM;
    String monitor;
    String keyBoard;
    String mouse;
    MotherBoard MB;

    abstract void buildCPU();

    abstract void buildRAM();

    abstract void getMB();

    abstract void buildMonitor();

    abstract void buildKeyboard();

    abstract void buildMouse();

    abstract IBM getIBM();
}
