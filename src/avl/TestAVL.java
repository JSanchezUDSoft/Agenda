
package avl;

import java.util.Scanner;

public class TestAVL {

    public static void main(String[] args) {
        
        Agenda agenda = Singleton.getAgenda();
        ArbolAVL arbol = Singleton.getAVL();
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        int numero = 0, op;
        boolean menu = true;

        for(int i=0; i<800000; i++){
            nombre = "Nombre" + i;
            numero = i;

            agenda.guardarContacto(nombre, numero);
            arbol.insertar(numero);
        }
        
        while(menu == true){
            System.out.println("Digite 1 para agregar, 2 para consultar, 3 para eliminar, 4 para mostrar el arbol y 0 para finalizar: ");
            op = leer.nextInt();
           switch(op){
               case 1:
                   System.out.println("Digite un nombre: ");
                   nombre = leer.next();
                   System.out.println("Digite un teléfono");
                   numero = leer.nextInt();
                   
                   agenda.guardarContacto(nombre, numero);
                   arbol.insertar(numero);
               break;
               case 2:
                   System.out.println("Buscar dato: ");
                   agenda.mostrarAgenda(leer.nextInt());
               break;
               case 3:
                   System.out.println("Digite el dato que desea eliminar: ");
                   agenda.eliminarContacto(leer.nextInt());
               break;
               case 4:
                   arbol.mostrarArbolAVL();
               break;
               case 0:
                   menu = false;
               default:
                   System.out.println("Opción incorrecta");
           }           
        }
    }
}
