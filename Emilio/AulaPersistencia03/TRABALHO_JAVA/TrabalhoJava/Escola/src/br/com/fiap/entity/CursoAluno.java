package br.com.fiap.entity;
 
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity
@Table(name="tb_curso_aluno") 
public class CursoAluno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="ID") 
	private int id;

	@Column(name="id_aluno") 
	private int id_aluno;

	@Column(name="id_curso") 
	private int id_curso;
	
	@Column(name="nota") 
	private double nota;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
}
