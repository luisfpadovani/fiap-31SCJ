package br.com.fiap.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import br.com.fiap.entity.CursoAluno;
import br.com.fiap.interfaces.ICursoAluno;
import br.com.fiap.jdbc.mapper.CursoAlunoMapper;

import java.util.ArrayList;
import org.springframework.jdbc.core.JdbcTemplate;

public class CursoAlunoDao implements ICursoAluno {

	private JdbcTemplate jdbcTemplate;

	// propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int Insert(CursoAluno item) {
		try {
			String sql = "INSERT INTO TB_CURSO_ALUNO (ID_ALUNO, ID_CURSO, NOTA) VALUES (?,?,?)";
			jdbcTemplate.update(sql, item.getId_aluno(), item.getId_curso(), item.getNota());
			return 1;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public int Update(CursoAluno item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CursoAluno> GetAll() {
		List<CursoAluno> cursoalunos = new ArrayList<>();
		try {
			String query = "SELECT * FROM TB_CURSO_ALUNO";
			cursoalunos = this.jdbcTemplate.query(query, new CursoAlunoMapper());
		} catch (Exception e) {
			throw e;
		}
		return cursoalunos;
	}

	@Override
	public CursoAluno GetBy(int id) {
		CursoAluno cursoaluno = null;
		try {
			String query = "SELECT * FROM TB_CURSO_ALUNO WHERE ID= ? ";
			cursoaluno = this.jdbcTemplate.queryForObject(query, new Integer[] { id }, new CursoAlunoMapper());
		} catch (Exception e) {
			throw e;
		}
		return cursoaluno;
	}

}
