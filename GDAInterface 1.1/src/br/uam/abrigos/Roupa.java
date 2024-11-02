package br.uam.abrigos;
    
import javax.swing.JOptionPane;

public class Roupa extends Produto{
    private String tamanho;
    private String obs;
    //Construtor
    public Roupa (){}
    public Roupa (String nome, String lugar, String tamanho, String obs){
        super(nome, lugar);
        this.tamanho = tamanho;
        this.obs = obs;
    }
    //Getters & Setters
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getObs(){
        return obs;
    }
    public void setObs(String obs){
        this.obs = obs;
    }
    //Print
    @Override
    public void print() {
        JOptionPane.showMessageDialog(null, "Dados do Produto \nID: " + getId() + "\nNome: " + getNome() + "\nTamanho: " + getTamanho() + "\nObservações: " + getObs());
    }
    //Edit
    @Override
    public void edit(String atributo,String novoValor){
        switch(atributo.toLowerCase()){
            case "tamanho":
                setTamanho(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            case "obs":
                setObs(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            case "nome":
                setNome(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            case "lugar":
                setLugar(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
            default:
                JOptionPane.showMessageDialog(null, "Atributo inválido");
        }
    }
}
    