package project2_polymorph;
public class Kampus_main_class {
    public static void main(String[] args) {
        PT induk = new PT();
        induk.Kampus();

        PT[] kampusKu = new PT[2];
        kampusKu[0] = new PTN();
        kampusKu[1] = new PTS();

        for (int i = 0; i < kampusKu.length; i++) {
            kampusKu[i].Kampus();
        }
    }
    
}
