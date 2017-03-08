package br.ufam.rest.model.retencao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.ufam.rest.model.Descricao;
import br.ufam.rest.model.Solucao;


import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;


/*
 * Classe que implementa a etapa de Retenção
 * 
 * */
public class Retencao {
	
	Collection<CBRCase> casosSelecionados;
	CBRCaseBase casoBase;
	List<CBRCase> casos, casosRetidos;
	int casoBaseSize;
	
	public Retencao(Collection<CBRCase> _casos_selecionados, CBRCaseBase _casoBase) {
		casosSelecionados = _casos_selecionados;
		casos = new ArrayList<CBRCase>(casosSelecionados);
		//System.out.println(casos);
		casosRetidos = new ArrayList<CBRCase>();
		//System.out.println(casosRetidos);
		casoBase = _casoBase;
		casoBaseSize = casoBase.getCases().size();//ultimo caso
		System.out.println("Numero de casos "+casoBaseSize);
	}
	
	public void addCasoRetido(int _caseNumber) {
		CBRCase _caso = casos.get(_caseNumber);		
		System.out.println("ETAPA RETENÇÃO");
		casos.remove(_caso);	
		
		// desc é um objeto do tipo Descricao e recebe a descricao do caso recuperado e escolhido para ser inserido como novo caso		
		Descricao desc = (Descricao) _caso.getDescription();
		// no método setCaseId, o atributo caseId é setado para o id_do_ultimo_caso+1
		desc.setCaseId(++casoBaseSize);
		System.out.println("desc"+desc);
		
		// sol é um objeto do tipo Solucao e recebe a solucao do caso recuperado e escolhido para ser inserido como nova solucao do novo caso		
		Solucao sol = (Solucao) _caso.getSolution();
		// no método setCaseId, o atributo solucaoId é setado para o atual valor de casoBaseSize( = id_do_ultimo_caso+1)
		sol.setSolucaoId(casoBaseSize);
		System.out.println("sol"+sol);
		casosRetidos.add(_caso);
	}
	
	public void learn() {
		if(casoBaseSize > 0)
			casoBase.learnCases(casosRetidos);
	}
	
	

	/*
	 * Parte da Solucao do Problema  
	 */
	/*
	public String getDiagnostico(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getDiagnostico();
	} */
	
	public String getSolucao(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getSolucao();
	}
	
/*	public String getPalavrasChavesSolucao(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getPalavrasChavesSolucao();
	}
*/
	public String getAcaoImplementada(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getAcaoImplementada();
	}
	
	public String getEfetividade(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getEfetividade();
	}
	/*
	public String getSolucaoImplementada(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getSolucaoImplementada();
	}
	*/
	public String getCustos(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getCustos();
	}
	
	public String getAtoresEnvolvidos(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getAtoresEnvolvidos();
	}	
	
	/*
	 * Parte da Decrição do Problema  
	 */
	
	public String getNaturezaProblema(int _caso) {
		Descricao desc  = getCaseDescription(_caso);
		return desc.getNaturezaProblema();
	}
	
	public String getPoloId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getPoloId();
	}
	
	
	/*
	public String getRelator(int _caso) {
		Descricao desc  = getCaseDescription(_caso);
		return desc.getRelator();
	}

	public String getTurmaId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getTurmaId();
	}
	
	public String getCursoId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getCursoId();
	}

	public String getDisciplinaId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getDisciplinaId();
	}

	public String getQtdeAlunos(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getQtdeAlunos();
	}
*/
	public String getDecricaoProblema(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getDescricaoProblema();
	}	

	public String getProblema(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getProblema();
	}	

	public String getPalavrasChavesProblema(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getPalavrasChavesProblema();
	}	
	
	public CBRCase getCase(int i) {
		CBRCase _case = casos.get(i);
		return _case;
	}
	
	public Descricao getCaseDescription(int _caseNumber) {
		CBRCase _case = getCase(_caseNumber);
		return (Descricao) _case.getDescription();
	}
	
	public Solucao getSolucaoCaso(int _caseNumber) {
		CBRCase _case = getCase(_caseNumber);
		return (Solucao) _case.getSolution();
	}
	
}
	

