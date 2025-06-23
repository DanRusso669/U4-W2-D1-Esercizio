package entities.esercizio3;

import exceptions.BancaException;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare:" + titolare + " - Saldo: " + saldo + " - Num movimenti:" + nMovimenti + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }

        try {
            if (x > maxPrelievo) {
                throw new BancaException("Il prelievo non è disponibile.");
            }
        } catch (BancaException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}
