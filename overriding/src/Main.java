public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = {new AskerKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager kredi:krediManagers){
            System.out.println(kredi.hesapla(1000));
        }
    }
}