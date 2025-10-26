package listacircular;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
    }
}

public class ListaCircular {
    private No inicio;

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
            inicio.proximo = inicio; // aponta pra si mesmo
        } else {
            No atual = inicio;
            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
            novo.proximo = inicio;
        }
    }

    public boolean buscar(int valor) {
        if (inicio == null) return false;
        No atual = inicio;
        do {
            if (atual.valor == valor) return true;
            atual = atual.proximo;
        } while (atual != inicio);
        return false;
    }

    public void remover(int valor) {
        if (inicio == null) return;

        No atual = inicio;
        No anterior = null;

        do {
            if (atual.valor == valor) {
                if (anterior == null) { // removendo o primeiro
                    No ultimo = inicio;
                    while (ultimo.proximo != inicio) {
                        ultimo = ultimo.proximo;
                    }
                    if (ultimo == inicio) {
                        inicio = null; // lista com um só nó
                    } else {
                        inicio = inicio.proximo;
                        ultimo.proximo = inicio;
                    }
                } else {
                    anterior.proximo = atual.proximo;
                }
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        } while (atual != inicio);
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }
        No atual = inicio;
        System.out.print("Lista Circular: ");
        do {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        } while (atual != inicio);
        System.out.println();
    }

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.listar();

        lista.remover(2);
        lista.listar();
    }
}

