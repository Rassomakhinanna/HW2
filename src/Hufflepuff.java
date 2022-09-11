public class Hufflepuff extends Hogwarts {
    public Hufflepuff(String name, int magic, int trans,int industrious, int loyal, int honesty) {
        if (industrious < 0 || industrious > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (loyal < 0 || loyal > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Ошибка");
        }
        this.name = name;
        this.magic = magic;
        this.trans = trans;
        this.industrious = industrious;
        this.loyal = loyal;
        this.honesty = honesty;
    }

    private int industrious;
    private int loyal;
    private int honesty;

    public void compareStudents(Hufflepuff student2) {
        int power1 = this.industrious + this.loyal + this.honesty;
        int power2 = student2.industrious + student2.loyal + student2.honesty;
        if (power1 > power2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (power2 > power1) {
            System.out.println(student2.name + " сильнее, чем " + this.name);
        } else if (power1 == power2) {
            System.out.println("Силы " + this.name + "и" + student2 + "равны");
        }
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getIndustrious() {
        return industrious;
    }

    @Override
    public String toString() {
        return name + " Hufflepuff, качества: \n" +
                "\n honesty=" + honesty +
                "\n loyal=" + loyal +
                "\n industrious=" + industrious +
                "\n name=" + name +
                "\n magic=" + magic +
                "\n trans=" + trans;
    }
}