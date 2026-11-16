package project1;

class Hewan {
    public void suaraHewan() {
        System.out.println("Hewan bersuara");
    }
}

class Tikus extends Hewan {
    public void suaraHewan() {
        System.out.println("Anjing bersuara : guk guk");
    }
}

class Kucing extends Hewan {
    public void suaraHewan() {
        System.out.println("Kucing bersuara : meong meong");
    }
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hewanSaya = new Hewan();
        Hewan tikusSaya = new Tikus();
        Hewan kucingSaya = new Kucing();
        hewanSaya.suaraHewan();
        tikusSaya.suaraHewan();
        kucingSaya.suaraHewan();
    }
}
