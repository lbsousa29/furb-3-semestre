import java.util.Scanner;

public class fiveQuestion {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite uma expressão: ");
            String expressao = sc.nextLine();

            PilhaLista<Character> pilha = new PilhaLista<>();
            boolean correta = true;

            for (int i = 0; i < expressao.length(); i++) {
                char c = expressao.charAt(i);

                if (c == '(' || c == '[' || c == '{') {
                    pilha.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (pilha.estaVazia()) {
                        correta = false;
                        break;
                    }

                    char topo = pilha.pop();

                    if ((c == ')' && topo != '(') ||
                            (c == ']' && topo != '[') ||
                            (c == '}' && topo != '{')) {
                        correta = false;
                        break;
                    }
                }
            }

            if (!pilha.estaVazia()) {
                correta = false;
            }

            if (correta) {
                System.out.println("Uso de delimitadores correto.");
            } else {
                System.out.println("Uso de delimitadores incorreto.");
            }

            sc.close();
        }
    }

