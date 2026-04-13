package Pilhas;

public interface InterfacePilha<T> {
   void push(T infoi);
   T pop();
   T peek();
   boolean estaVazia();
   void liberar();
}
