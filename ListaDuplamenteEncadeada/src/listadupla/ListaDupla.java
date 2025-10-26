package listadupla;

class No {
    int valor;
    No anterior;
    No proximo;

    public No(int valor) {
        this.valor = valor;
    }
}

public class ListaDupla {
    private No inicio;
    private No fim;

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public boolean buscar(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) return true;
            atual = atual.proximo;
        }
        return false;
    }

    public void remover(int valor) {
        if (inicio == null) return;

        No atual = inicio;
        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }

        if (atual == null) return;

        if (atual == inicio) inicio = atual.proximo;
        if (atual == fim) fim = atual.anterior;

        if (atual.anterior != null) atual.anterior.proximo = atual.proximo;
        if (atual.proximo != null) atual.proximo.anterior = atual.anterior;
    }

    public void listar() {
        No atual = inicio;
        System.out.print("Lista (início → fim): ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void listarReverso() {
        No atual = fim;
        System.out.print("Lista (fim → início): ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(15);
        lista.inserir(25);
        lista.listar();
        lista.listarReverso();

        lista.remover(15);
        lista.listar();
    }
}

