package br.uam.abrigos;

import javax.swing.JOptionPane;

public class GerenciadorDeProdutos {

    private Produto[] produtos;
    private int index;
    private int nextId, idEst;

    // Cria o array
    public GerenciadorDeProdutos() {
        this.produtos = new Produto[10];
        this.index = 0;
        this.nextId = 1;
    }

    // Redimensiona o array
    public void redimensionarArray() {
        Produto[] novoArray = new Produto[produtos.length * 2];
        System.arraycopy(produtos, 0, novoArray, 0, produtos.length);
        produtos = novoArray;
    }

    // Método para inserir objeto no array
    public void addP(Produto Produto, int categoria) {
        if (index == produtos.length) {
            redimensionarArray();
        }
        idEst = categoria + nextId;
        Produto.setId(idEst);
        System.out.println("Produto registrado com sucesso");
        produtos[index++] = Produto;
        nextId++;
    }

     // Método privativo para buscar o índice de um item por id
    private int getIdProduto(int id) {
        for (int i = 0; i <= index; i++) {
            if (produtos[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    
    // Método para remover um objeto do array
    public void delP(int id) {
        int index2 = getIdProduto(id);
        if (index2 != -1) {
            for (int i = index2; i <= index; i++) {
                produtos[i] = produtos[i + 1];
            }
            produtos[--index] = null;
            System.out.println("Produto removido");
        }
    }

    //Método para editar atributo por Id
    public void editarObj(int id, String atributo, String novoValor) {
        int index2 = getIdProduto(id);
        if (index2 != -1) {

            produtos[index2].edit(atributo, novoValor);
            JOptionPane.showMessageDialog(null, "Produto editado!");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
    }

    public void buscarProduto(int id) {
        int index2 = getIdProduto(id);
        produtos[index2].print();

    }
}
