public class Main {
    public static void main(String[] args) {
        Gryffindor RY = new Gryffindor("Рон Уизли", 6, 16, 26, 36, 46);
        Gryffindor GG = new Gryffindor("Гермиона Грейнджер", 2, 12, 22, 32, 42);
        Ravenclaw PP = new Ravenclaw("Падма Патил", 4,14,24,34,44,54);
        Ravenclaw MB = new Ravenclaw("Маркус Белби", 9,19,29,39,49,59);
        Hufflepuff ZS = new Hufflepuff("Захария Смит", 0,1,2,3,4);
        Hufflepuff SD = new Hufflepuff("Седрик Диггори", 2,3,4,5,6);
        Slytherin GrG = new Slytherin("Грегори Гойл", 3,4,5,6,7,8, 6);
        Slytherin DM = new Slytherin("Драко Малфой", 6,7,8,9,10,11,23);
        System.out.println(RY);
        System.out.println(GG);
        System.out.println(PP);
        System.out.println(MB);
        System.out.println(ZS);
        System.out.println(SD);
        System.out.println(GrG);
        System.out.println(DM);

        RY.compareStudents(GG);
        PP.compareStudents(MB);
        ZS.compareStudents(SD);
        GrG.compareStudents(DM);

        GG.compareStudents(ZS);

    }
}