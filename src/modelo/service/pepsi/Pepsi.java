package modelo.service.pepsi;

import modelo.service.Industria;

public class Pepsi implements Industria {

    public modelo.service.Lata Lata() {
    
        return new Pepsi_lata();
    }

    public modelo.service.Botella Botella() {
        return new Pepsi_botella();
    }

    


}
