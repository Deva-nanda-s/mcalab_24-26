class Cpu {
    int price;

    public Cpu(int price) {
        this.price = price;
    }

    public void dis() {
        System.out.println("Price" + price);
    }

    class Processor {
        int core;
        String manu;

        public Processor(int core, String manu) {
            this.core = core;
            this.manu = manu;

        }

        public void display() {
            System.out.println("Cores:" + core + "Manufacturer:" + manu);
        }
    }

    static class RAM {
        int mem;
        String manuf;

        public RAM(int mem, String manuf) {
            this.mem = mem;
            this.manuf = manuf;
        }

        public void disr() {
            System.out.println("Memory" + mem + "Manufacturer:" + manuf);
        }
    }
}

public class CpuDemo {
    public static void main(String[] a) {
        Cpu c = new Cpu(4000);
        Cpu.Processor pr = c.new Processor(4, "intel");
        Cpu.RAM r = new Cpu.RAM(1000, "ABC");
        c.dis();
        pr.display();
        r.disr();
    }
}
