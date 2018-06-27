package br.com.fiap.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import br.com.fiap.entity.CursoAluno;

public class CursoAlunoMapper implements RowMapper<CursoAluno> {
	
	@Override
	public CursoAluno mapRow(ResultSet rs, int arg1) throws SQLException {
		CursoAluno cursoAluno = new CursoAluno();
		cursoAluno.setId(rs.getInt("ID"));
		cursoAluno.setId_aluno(rs.getInt("ID_ALUNO")); 
		cursoAluno.setId_curso(rs.getInt("ID_CURSO")); 
		cursoAluno.setNota(rs.getDouble("NOTA")); 
		return cursoAluno;
	}
}
