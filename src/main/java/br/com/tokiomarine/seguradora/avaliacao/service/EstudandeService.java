package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;

public interface EstudandeService {

	List<Estudante> buscarEstudantes();

	void cadastrarEstudante(@Valid Estudante estudante);

	Estudante buscarEstudante(final Long id);

	void atualizarEstudante(@Valid Estudante estudante);
	
	void apagarEstudante(final Long id);
}
