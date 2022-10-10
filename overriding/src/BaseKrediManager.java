public class BaseKrediManager {
    public double hesapla(double tutar){//bir methodu override olmasini istemiyorsak final keywordu ile onu
                                        //override olamaz halle getirebililiz
                                        // public final double hesapla(double tutar){}; su sekilde yazabiliriz.

        return tutar*1.18;
    }
}
