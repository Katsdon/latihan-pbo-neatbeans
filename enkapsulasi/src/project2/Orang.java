package project2;

/**
 *
 * @author User
 */
public class Orang {
    private String nama;

    public String getNama() {
        return nama;
    }
    
    public void setnama(String newNama) {
        this.nama = newNama;
    }
}
   class main {
    
    public static void main(String[] args) {
          Orang obj1 = new Orang();
                    obj1.setnama("Brojonegoro");

        System.out.println(obj1.getNama());
    }
    
}
