package d20staticblock_instanceblock_oop;

import javax.crypto.spec.PSource;

public class InstanceBlock2 {

    public int year;

    //instance block
    {
        System.out.println("Herkese selam");
    }

    // Tekrar eden kodlar tek satira dusuruldu tekrarlardan kurtulduk

    public InstanceBlock2() {
        //Buradaki sout'u silip instance block icine aldik
    }

    public InstanceBlock2(int year) {
        //Buradaki sout'u silip instance block icine aldik
        this.year = year;
    }
}
