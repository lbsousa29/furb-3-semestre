package Pilhas;

public class PilhaVetor<T> implements InterfacePilha<T> {

    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.info = new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        if (tamanho == limite) {
            throw new PilhaCheiaException();
        }
        this.info[tamanho] = info;
        tamanho++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }

        T valor = (T) info[tamanho - 1];
        info[tamanho - 1] = null;
        tamanho--;
        return valor;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }

        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            pop();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = tamanho - 1; i >= 0; i--) {
            sb.append(info[i]);
            if (i > 0) {
                sb.append(",");
            }
        }

        return sb.toString();
    }

    public void concatenar(PilhaVetor<T> p) {
        int totalNecessario = this.tamanho + p.tamanho;
        if (totalNecessario > this.limite) {
            throw new PilhaCheiaException();
        }

        PilhaVetor<T> aux = new PilhaVetor<>(p.tamanho);

        while (!p.estaVazia()) {
            T valor = p.pop();
            aux.push(valor);
        }

        while (!aux.estaVazia()) {
            T valor = aux.pop();
            p.push(valor);
            this.push(valor);
        }
    }
}