package br.uam.abrigos;

public class Produto {
    public String nome;
    public String lugar;
    public int id;

    //Construtores
    public Produto(){}
    public Produto(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }
    //Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    //Print
    public void print(){
        
    }
  
    //Método para editar atributo por Id
    public void edit(String atributo, String novoValor){
    }

    
}