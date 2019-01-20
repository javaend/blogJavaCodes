public class Employe {
        int id;
        String name;
//Setters & Getters
        @Override
        public boolean equals(Object obj) {             
                Employe e = (Employe) obj;
                boolean flag = false;
                if (this.getId() == e.getId()) {
                        flag = true;
                }
                return flag;
        }
        public static void main(String[] args) {
                Employe e1 = new Employe();
                Employe e2 = new Employe();
                e1.setId(101);
                e2.setId(101);
                System.out.println(e1.equals(e2));//true
        }
}
