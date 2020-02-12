package br.com.suplem.loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Entity transformar asclasses modelos como entidades do banco de dados
@Entity
public class Produto {
	@Id
	//próprio banco já atribua um valor do id automaticamente
	//auto-incremental, enviando o parâmetro strategy = GenerationType.IDENTITY:
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
    private String descricao;
    private String sabor;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	@Override
    public String toString() {
        return "Produto [nome=" + nome + ", descricao=" + descricao + ", sabor=" + sabor + "]";
    }
}

    

