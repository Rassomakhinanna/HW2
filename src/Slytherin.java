public class Slytherin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int power;

    public void compareStudents(Slytherin student2) {
        int power1 = this.cunning + this.resoluteness + this.ambition + this.resourcefulness + this.power;
        int power2 = student2.cunning + student2.resoluteness + student2.ambition + student2.resourcefulness + student2.power;
        if (power1 > power2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (power2 > power1) {
            System.out.println(student2.name + " сильнее, чем " + this.name);
        } else if (power1 == power2) {
            System.out.println("Силы " + this.name + "и" + student2 + "равны");
        }
    }
    public Slytherin(String name, int magic, int trans,int cunning, int resoluteness, int ambition, int resourcefulness, int power) {
        if (cunning < 0 || cunning > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (resoluteness < 0 || resoluteness > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Ошибка");
        }
        if (power < 0 || power > 100) {
            throw new RuntimeException("Ошибка");
        }
        this.name = name;
        this.magic = magic;
        this.trans = trans;
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.power = power;
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getCunning() {
        return cunning;
    }

    @Override
    public String toString() {
        return name + " Slytherin, качества: \n" +
                "\n cunning=" + cunning +
                "\n resoluteness=" + resoluteness +
                "\n ambition=" + ambition +
                "\n resourcefulness=" + resourcefulness +
                "\n power=" + power +
                "\n name=" + name +
                "\n magic=" + magic +
                "\n trans=" + trans;
    }
}
