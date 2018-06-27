package br.com.fiap.entity;
 
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity
@Table(name="tb_curso") 
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="ID") 
	private int id;
	
	@Column(name="NOME", length=100) 
	private String nome;
 
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
}
