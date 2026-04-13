public class ListaDuplaTeste {
    public static void main(String[] args) {

        ListaDupla<Integer> lista = new ListaDupla<>();

        // Caso 1

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        System.out.println("Caso 1");
        System.out.println("Lista (inicio -> fim): " + lista);

        System.out.print("Lista inversa: ");
        lista.exibirOrdemInversa();
        System.out.println("\n");

        // Caso 2
        System.out.println("Caso 2 ");
        System.out.println(lista.buscar(20) != null ?  "Encontrou 20" : "Não encontrou");
        System.out.println();

        // Caso 3
        System.out.println("Caso 3");
        System.out.println(lista.buscar(10) != null ? "Encontrou 10" : "Não encontrou");
        System.out.println();

        // Caso 4
        ListaDupla<Integer> lista2 = new ListaDupla<>();
        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);
        lista2.inserir(20);

        lista2.retirar(20);

        System.out.println("Caso 4 ");
        System.out.println("Lista: " + lista2);
        System.out.print("Inversa: ");
        lista2.exibirOrdemInversa();
        System.out.println("\n");

        // Caso 5
        ListaDupla<Integer> lista3 = new ListaDupla<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);

        lista3.retirar(10);

        System.out.println("Caso 5");
        System.out.println("Lista: " + lista3);
        System.out.print("Inversa: ");
        lista3.exibirOrdemInversa();
        System.out.println("\n");

        // Caso 6
        ListaDupla<Integer> lista4 = new ListaDupla<>();
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);

        lista4.retirar(5);

        System.out.println("Caso 6");
        System.out.println("Lista: " + lista4);
        System.out.print("Inversa: ");
        lista4.exibirOrdemInversa();
        System.out.println("\n");

        // Caso 7
        ListaDupla<Integer> lista5 = new ListaDupla<>();
        lista5.inserir(5);
        lista5.inserir(10);
        lista5.inserir(15);
        lista5.inserir(20);

        lista5.liberar();

        System.out.println("Caso 7 ");
        System.out.println("Lista após liberar: " + lista5);
    }
}
