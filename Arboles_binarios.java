/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg;
    
public class Arboles_binarios {
    Nodo_Arbol raiz;
   
    public Arboles_binarios(){
        this.raiz = null;
    }
   
    //insertar un nodo
    public void addNodo(int dato){
        Nodo_Arbol nuevo = new Nodo_Arbol(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo_Arbol aux = raiz;
            Nodo_Arbol padre;
            while(true){
                padre=aux;
                if(dato<aux.dato){
                    //va a la izquierda
                    aux= aux.hijoIzquierdo;
                    if(aux==null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    //va a la derecha
                    aux = aux.hijoDerecho;
                    if(aux == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    public boolean estavacia(){
        return raiz==null;
    }
    
    public void inOrden(Nodo_Arbol num ){
        if (num!=null){

        inOrden(num.hijoIzquierdo);
        System.out.print(num.dato + ", ");
        inOrden(num.hijoDerecho);
    }
  }
    public void preOrden(Nodo_Arbol num ){
        if (num!=null){
        System.out.print(num.dato + " , ");
        inOrden(num.hijoIzquierdo);
        inOrden(num.hijoDerecho);
    }   
 }

    public void postorden(Nodo_Arbol num ){
         if (num!=null){

        postorden(num.hijoIzquierdo);
       
        postorden(num.hijoDerecho);
        System.out.print(num.dato + ",");
    }
   }
    public void limpiar(){
    while(!estavacia()){
           pop();
    }
   }
    
}

