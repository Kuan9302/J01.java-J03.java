class PC {
    private CPU cpu;
    private HD hd;
    public PC() {
        this.cpu = new CPU(2.4);
        this.hd = new HD(160);
    }
    public int getCost() {
        return cpu.getCost() + hd.getCost() + 500;
    }
    public int getPrice() {
        return (int) (getCost() * 1.8);
    }
}

class MultiPC {
    private CPU cpu;
    private HD hd;
    private int cpuCount;
    private int hdCount;
    public MultiPC(int cpuCount, int hdCount) {
        this.cpu = new CPU(2.4);
        this.hd = new HD(160);
        this.cpuCount = cpuCount;
        this.hdCount = hdCount;
    }
    public int getCost() {
        return (int) (cpu.getCost() * cpuCount + hd.getCost() * hdCount * 1.2);
    }
    public int getPrice() {
        return (int) (getCost() * 1.8);
    }
}

public class DesktopMain {
    public static void main(String[] args) {
        PC pc = new PC();
        System.out.println("PC cost:" + pc.getCost() + "， price:" + pc.getPrice());
        MultiPC multiPC1 = new MultiPC(2, 4);
        System.out.println("MultiPC: 2CPU， 4HD:， cost:" + multiPC.getCost() + "， price:" + multiPC.getPrice());
        MultiPC multiPC2 = new MultiPC(4, 8);
        System.out.println("MultiPC: 4CPU， 8HD:， cost:" + multiPC.getCost() + "， price:" + multiPC.getPrice());
    }
}
