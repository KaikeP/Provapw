package aulapw;

import java.io.Serializable;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity

public class Produtos implements Serializable{
	private Integer codBarras;
	private String  nomeProduto;
	private String marca;
	private Integer quantidade;
	private String dataCadastro;
	
	
	public Produtos(Integer codBarras, String nomeProduto, String marca, Integer quantidade, String dataCadastro) {
		super();
		this.codBarras = codBarras;
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.quantidade = quantidade;
		this.dataCadastro = dataCadastro;
	}
	
	public Produtos () {
		
	}

	public Integer getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(Integer codBarras) {
		this.codBarras = codBarras;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String toString(){
		return "Produtos [codBarras" + codBarras + "nomeProduto" + nomeProduto + "marca" + marca + "quantidade" + quantidade + "dataCadastro" + dataCadastro + "]"; 
	}
}
