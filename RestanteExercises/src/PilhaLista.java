public class PilhaLista <T> implements Pilha<T> {
    private ListaEncadeada<T> lista;

    public PilhaLista(){
        lista = new ListaEncadeada<>();
    }
    @Override
    public T peek(){
        if (estaVazia()){
            throw new PilhaVaziaException("Pilha etá vazia");
        }
        return lista.obter();
    }
    @Override
    public T pop  (){
       if (estaVazia()){
           throw new PilhaVaziaException("Pilha vazia");
       }
       return lista.retirar();
    }
    @Override
   public void push(T info){
        lista.inserir(info);
   }
   @Override
   public boolean estaVazia(){
    return lista.estaVazia();
   }
   @Override
   public void liberar(){
        lista.liberar();
   }

    @Override
    public String toString() {
        return lista.toString();
    }
}
