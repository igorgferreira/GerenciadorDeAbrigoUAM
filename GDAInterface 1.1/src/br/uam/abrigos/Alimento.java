package br.uam.abrigos;

import javax.swing.JOptionPane;

public class Alimento extends Produto {

    private String marca;
    private String validade;
    private float peso;
    private boolean refrigerado;
    //Construtor
    public Alimento() {
    }
    public Alimento(String nome, String lugar, float peso, boolean refrigerado, String marca, String validade) {
        super(nome, lugar);
        this.marca = marca;
        this.validade = validade;
        this.peso = peso;
        this.refrigerado = refrigerado;
    }
    //Getters & Setters
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String isRefrigerado() {
        if (refrigerado == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }
    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }
    //Print 
    @Override
    public void print() {
        JOptionPane.showMessageDialog(null, "Dados do Produto \nID: " + getId() + "\nNome: " + getNome() + "\nPeso: " + getPeso() + "\nValidade: " + getValidade() + "\nMarca: " + getMarca() + "\nPrecisa de refrigeração: " + isRefrigerado());
    }
    //Edit 
    @Override 
    public void edit(String atributo, String novoValor) {
        switch (atributo.toLowerCase()) {
            case "marca":
                setMarca(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            case "validade":
                setValidade(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            case "nome":
                setNome(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            case "lugar":
                setLugar(novoValor);
                JOptionPane.showMessageDialog(null, "Produto editado!");
            case "peso":
                setPeso(Float.parseFloat(novoValor));
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            case "refrigerado":
                setRefrigerado(Boolean.getBoolean(novoValor));
                JOptionPane.showMessageDialog(null, "Produto editado!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Atributo inválido");
        }
    }
}
