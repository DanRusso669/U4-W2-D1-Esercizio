import entities.esercizio3.ContoCorrente;
import entities.esercizio3.ContoOnline;

public class Main {
    public static void main(String[] args) {

        ContoCorrente mioConto = new ContoCorrente("Mario", 200);
        ContoOnline mioOnline = new ContoOnline("Luigi", 200, 100);

        mioConto.preleva(100);
        System.out.println(mioConto.restituisciSaldo());
        System.out.println(mioConto.getnMovimenti());
        mioConto.preleva(150);
        System.out.println(mioConto.getnMovimenti());
        System.out.println(mioConto.restituisciSaldo());

        mioOnline.stampaSaldo();
        mioOnline.preleva(100);
        mioOnline.stampaSaldo();
        mioOnline.preleva(105);
        mioOnline.stampaSaldo();
    }
}