package com.dh.meli.w3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dh.meli.w3.entity.Aluno;

@Service
public class AlunoService {

	private static List<Aluno> listaDeAlunos = new ArrayList<Aluno>();

	public Aluno cadastra(Aluno aluno) {
		listaDeAlunos.add(aluno);
		Long idAluno = (long) listaDeAlunos.size();
		aluno.setId(idAluno);
		return aluno;
	}
	
	public List<Aluno> listaAlunos(){
		return AlunoService.listaDeAlunos;
	}

	public Aluno get(Long id) {
	    for (Aluno aluno : listaDeAlunos) {
			if(aluno.getId().equals(id)) {
				return aluno;
			}
		}
	    return null;
	}
}
