/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avl;

import java.util.ArrayList;

public class Agenda {
    
    Contacto cto = Singleton.getContacto();
    ArbolAVL arbol = Singleton.getAVL();
    
    ArrayList agendaNormal= new ArrayList();

    public Agenda() {
        
    }
    
    public void guardarContacto(String a, int b){
        cto = new Contacto(a,b);
        agendaNormal.add(cto);
    }
    
    public void construirArbol(){
        ArbolAVL arbol = new ArbolAVL();
        
        for(int i=0;i<agendaNormal.size();i++){
            Contacto ctoCon=(Contacto) agendaNormal.get(i);
            arbol.insertar(ctoCon.getNumero());
        }
    }
    
    public void mostrarAgenda(int a){        
        ArbolAVL arbol = Singleton.getAVL();
        for(int i=0;i<agendaNormal.size();i++){
            Contacto ctoCon=(Contacto) agendaNormal.get(i);
            
            if(a == ctoCon.getNumero() && arbol.buscar(a) == true){
                System.out.println(ctoCon.getNombre() + " Teléfono: " +  ctoCon.getNumero());
            }
        }
    }
    
    public void eliminarContacto(int a){
        ArbolAVL arbol = Singleton.getAVL();
        arbol.eliminar(a);
        
        for(int i=0;i<agendaNormal.size();i++){
            Contacto ctoCon=(Contacto) agendaNormal.get(i);
 
            if(a == ctoCon.getNumero()){
                agendaNormal.remove(i);
                System.out.println("El contacto " + a + "ha sido eliminado");
            }
        }
    }
}