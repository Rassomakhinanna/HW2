public class Ravenclaw extends Hogwarts {
    public Ravenclaw(String name, int magic, int trans,int mind, int wisdom, int witty, int creative) {
    if (mind < 0 || mind > 100) {
        throw new RuntimeException("Ошибка");
    }
        if (wisdom < 0 || wisdom > 100) {
        throw new RuntimeException("Ошибка");
    }
        if (witty < 0 || witty > 100) {
        throw new RuntimeException("Ошибка");
    }
        if (creative < 0 || creative > 100) {
            throw new RuntimeException("Ошибка");
        }
        this.name = name;
        this.magic = magic;
        this.trans = trans;
        this.mind = mind;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    private int mind;
    private int wisdom;
    private int witty;
    private int creative;

    public void compareStudents(Ravenclaw student2) {
        int power1 = this.mind + this.wisdom + this.witty + this.creative;
        int power2 = student2.mind + student2.wisdom + student2.witty + student2.creative;
        if (power1 > power2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (power2 > power1) {
            System.out.println(student2.name + " сильнее, чем " + this.name);
        } else if (power1 == power2) {
            System.out.println("Силы " + this.name + "и" + student2 + "равны");
        }
    }


    public int getCreative() {
        return creative;
    }

    public int getWitty() {
        return witty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getMind() {
        return mind;
    }

    @Override
    public String toString() {
        return name + " Ravenclaw, качества: \n" +
                "\n mind=" + mind +
                "\n wisdom=" + wisdom +
                "\n witty=" + witty +
                "\n creative=" + creative +
                "\n name=" + name +
                "\n magic=" + magic +
                "\n trans=" + trans;
    }
}
