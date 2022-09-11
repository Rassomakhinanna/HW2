public class Hogwarts {
    String name;
        int magic;
        int trans;


    public void compareStudents(Hogwarts student2){
            int power1 = this.magic + this.trans;
            int power2 = student2.magic + student2.trans;
            if (power1>power2) {
                System.out.println(this.name + " сильнее, чем " + student2.name);
            } else if (power2>power1) {
                System.out.println(student2.name + " сильнее, чем " + this.name);
            } else if (power1==power2) {
                System.out.println("Силы " + this.name + "и" + student2 + "равны");
            }
        }




    public int getTrans() {
            return trans;
        }

        public void setTrans(int trans) {
            if (trans<0 || trans > 100) {
                throw new RuntimeException("Ошибка");
            }
            this.trans = trans;
        }

        public int getMagic() {
            return magic;
        }

        public void setMagic(int magic) {
            if (magic<0 || magic > 100) {
                throw new RuntimeException("Ошибка");
            }
            this.magic = magic;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
