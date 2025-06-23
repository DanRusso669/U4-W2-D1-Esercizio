package entities.esercizio3;

import exceptions.BancaException;
import exceptions.NegativePrelievo;

public class ContoCorrente {
    protected final int maxMovimenti = 50;
    protected String titolare;
    protected int nMovimenti;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public void preleva(double x) {
        try {
            if (x < 0) {
                throw new NegativePrelievo("Non puoi prelevare in negativo");
            }
            if (nMovimenti < maxMovimenti) {
                saldo = saldo - x;
                if (saldo < 0) {
                    nMovimenti++;
                    throw new BancaException("Conto in rosso.");
                }
            } else {
                saldo = saldo - x - 0.50;
            }
            nMovimenti++;
        } catch (BancaException | NegativePrelievo e) {
            System.out.println(e.getMessage());
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
