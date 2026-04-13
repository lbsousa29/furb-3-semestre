public class PilhaTest {
    public static void main(String[] args){
        PilhaLista<Integer> p1 =new PilhaLista<>();
        //Test one
        System.out.println("A pilha esta " + p1.estaVazia());
        //Test two
        PilhaLista<Integer> p2 =new PilhaLista<>();
        p2.push(10);
        System.out.println("A pilha esta " + p2.estaVazia());
        //Test three
        PilhaLista<Integer> p3 =new PilhaLista<>();
        p3.push(10);
        p3.push(20);
        p3.push(30);
        System.out.println("O n° é: " + p3.pop());
        System.out.println("O n° é: " + p3.pop());
        System.out.println("O n° é " + p3.pop());
        System.out.println("O n° retirado é: " + p3.estaVazia());
        //Test four
        PilhaLista<Integer> p4 =new PilhaLista<>();
        p4.push(10);
        p4.push(20);
        p4.push(30);
        System.out.println("O n° no topo é: " + p4.peek());
        System.out.println("O n° retirado é: " + p4.pop());
        //Test five
        PilhaLista<Integer> p5 =new PilhaLista<>();
        p5.push(10);
        p5.push(20);
        p5.push(30);
        p5.liberar();
        System.out.println("A lista esta: " + p5.estaVazia());
    }

}
