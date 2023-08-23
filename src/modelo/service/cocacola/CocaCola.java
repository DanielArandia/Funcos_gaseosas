package modelo.service.cocacola;

import modelo.service.Industria;

public class CocaCola implements Industria{

    public modelo.service.Lata Lata() {
        return new CocaCola_lata();
    }

    public modelo.service.Botella Botella() {
        return new CocaCola_botella();        
    }

  
    
}
