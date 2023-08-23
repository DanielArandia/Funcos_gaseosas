package cliente;

import modelo.service.Botella;
import modelo.service.Industria;
import modelo.service.Lata;
import modelo.service.cocacola.CocaCola;
import modelo.service.pepsi.Pepsi;

public class Cliente {
    Industria i = null;

    public void  cocacola(){
        i = new CocaCola();
        Lata l = i.Lata();
        Botella b = i.Botella();
        System.out.println(b.CrearFunkoBotella());
        System.out.println(l.CrearFunkoLata());
    }

    public void pepsi(){
        i = new Pepsi();
        Botella b = i.Botella();
        Lata l = i.Lata();
        System.out.println(b.CrearFunkoBotella());
        System.out.println(l.CrearFunkoLata());
    }
}
