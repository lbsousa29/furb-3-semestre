public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public ListaDupla() {
        primeiro = null;
    }

    public void inserir(T valor) {
        NoListaDupla<T> novo = new NoListaDupla<>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        this.primeiro = novo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = this.primeiro;

        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {

         NoListaDupla<T> p = buscar(valor);

    if (p != null) {

        // Caso 1: é o primeiro
        if (p == primeiro) {
            primeiro = p.getProximo();
            if (primeiro != null) {
                primeiro.setAnterior(null);
            }
        } else {
            // Caso 2: meio OU último
            NoListaDupla<T> anterior = p.getAnterior();
            NoListaDupla<T> proximo = p.getProximo();

            anterior.setProximo(proximo);

            if (proximo != null) {
                proximo.setAnterior(anterior);
            }
        }

        // (garante remoção completa)
        p.setAnterior(null);
        p.setProximo(null);
    }
    }

    public void exibirOrdemInversa() {
        NoListaDupla<T> p = this.primeiro;
        if(p == null) return;
        while (p.getProximo() != null) {
            p = p.getProximo();
        }
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }

    }

    public void liberar() {
        NoListaDupla<T> p = this.primeiro;
        while (p != null) {
            NoListaDupla<T> proximo = p.getProximo();
            p.setProximo(null);
            p.setAnterior(null);
            p = proximo;
        }
        this.primeiro = null;
    }

    @Override
    public String toString() {
        String resultado = "";
        NoListaDupla<T> atual = primeiro;

        while (atual != null) {
            resultado += atual.getInfo() + ", ";
            atual = atual.getProximo();
        }

        return resultado;
    }
}
