
package agendanormal;


public class Singleton {
    
    private static VentanaPrincipal vp = new VentanaPrincipal();
    private static Agregar ag = new Agregar();

    private Singleton() {
    }

    public static VentanaPrincipal getVp() {
        return vp;
    }

    public static Agregar getAg() {
        return ag;
    }
    
    
    
    
   
}
