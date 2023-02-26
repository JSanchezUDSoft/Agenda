package agendanormal;

/**
 *
 * @author Estudiantes
 */

public class AgendaNormal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //unica instancia
        VentanaPrincipal vp = Singleton.getVp();
        vp.setVisible(true);
    }
    
}
