public class ListaEncadeada <T> {


    private NoLista<T> primeiro;


    public ListaEncadeada() {
        primeiro = null;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista<>(info);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void liberar() {
        primeiro = null;
    }


    public T retirar() {
        if (primeiro == null) return null;

        T valor = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return valor;
    }

    public T obter() {
        if (primeiro == null) return null;

        return primeiro.getInfo();
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> atual = primeiro;

        while (atual != null) {
            sb.append(atual.getInfo());
            if (atual.getProximo() != null) {
                sb.append(",");

            }
            atual = atual.getProximo();


        }
        return sb.toString();
    }
}

