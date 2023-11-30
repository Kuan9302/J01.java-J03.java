class Note15 {
    private LCD lcd;
    private CPU cpu;
    private HD hd;
    public Note15() {
        this.lcd = new LCD(15);
        this.cpu = new CPU(2.2);
        this.hd = new HD(160);
    }
    public int getPrice() {
        return (int) (lcd.getCost() + cpu.getCost() + hd.getCost()) * 2;
    }
}

class PC {
    private CPU cpu;
    private HD hd;

    public PC() {
        this.cpu = new CPU(2.4);
        this.hd = new HD(160);
    }
    public int getPrice() {
        return (int) (cpu.getCost() + hd.getCost() + 500) * 2;
    }
}

class A11PC {
    public static boolean isExpensive(Note15 note15, PC pc) {
        return note15.getPrice() > pc.getPrice();
    }
}

public class PriceComparison {
    public static void main(String[] args) {
        Note15 note15 = new Note15();
        PC pc = new PC();
        boolean isExpensive = A11PC.isExpensive(note15, pc);
        if (isExpensive) {
            System.out.println("Note15 is more expensive than PC");
        } else {
            System.out.println("PC is more expensive than Note15");
        }
    }
}
