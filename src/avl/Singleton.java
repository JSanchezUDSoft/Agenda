
package avl;

public class Singleton {
    private static Contacto contacto = new Contacto();
    private static Agenda agenda = new Agenda();
    private static ArbolAVL arbolbinario = new ArbolAVL();

    private Singleton() {
    }

    public static Contacto getContacto() {
        return contacto;
    }

    public static Agenda getAgenda() {
        return agenda;
    }
    
    public static ArbolAVL getAVL() {
        return arbolbinario;
    }
    
}
