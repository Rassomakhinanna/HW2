public class Gryffindor extends Hogwarts {
    private int nobility;
    private int bravery;
    private int honour;

    public void compareStudents(Gryffindor student2){
        int power1 = this.nobility + this.bravery + this.honour;
        int power2 = student2.nobility + student2.bravery + student2.honour;
        if (power1>power2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (power2>power1) {
            System.out.println(student2.name + " сильнее, чем " + this.name);
        } else if (power1==power2) {
            System.out.println("Силы " + this.name + "и" + student2 + "равны");
        }
    }

    public Gryffindor(String name, int magic, int trans, int nobility, int honor, int bravery) {
        if (honour < 0 || honour > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Ошибка");
        }
        this.name = name;
        this.magic = magic;
        this.trans = trans;
        this.nobility = nobility;
        this.honour = honor;
        this.bravery = bravery;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honour;
    }

    public int getNobility() {
        return nobility;
    }
    @Override
    public String toString() {
        return name + " Gryffindor, качества: \n" +
                "\n nobility=" + nobility +
                "\n bravery=" + bravery +
                "\n honour=" + honour +
                "\n name=" + name +
                "\n magic=" + magic +
                "\n trans=" + trans;
    }
}
