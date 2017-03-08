package br.ufam.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Caso {
	int caseId;
	String naturezaProblema; 	
	//String relator; 
	//String cursoId;
	//String disciplinaId;
	String poloId;
	String descricaoProblema;
	String problema;
	String palavrasChavesProblema;
	int solucaoId;
	//String diagnostico;
	String solucao;
	String palavrasChavesSolucao;
	String acaoImplementada;
	String efetividade; 
	String solucaoImplementada;
	
	
	public String getPalavrasChavesSolucao() {
		return palavrasChavesSolucao;
	}
	public void setPalavrasChavesSolucao(String palavrasChavesSolucao) {
		this.palavrasChavesSolucao = palavrasChavesSolucao;
	}
	public String getSolucaoImplementada() {
		return solucaoImplementada;
	}
	public void setSolucaoImplementada(String solucaoImplementada) {
		this.solucaoImplementada = solucaoImplementada;
	}
	public String getImpactoPedagogico() {
		return impactoPedagogico;
	}
	public void setImpactoPedagogico(String impactoPedagogico) {
		this.impactoPedagogico = impactoPedagogico;
	}
	
	String custos;
	String impactoPedagogico;
	String atoresEnvolvidos;
	Double similaridade;

	public int getCaseId() {
		return caseId;
	}
	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	
	public String getPoloId() {
		return poloId;
	}
	public void setPoloId(String poloId) {
		this.poloId = poloId;
	}
/*
	public String getCursoId() {
		return cursoId;
	}
	public void setCursoId(String cursoId) {
		this.cursoId = cursoId;
	}

	public String getDisciplinaId() {
		return disciplinaId;
	}


	public void setDisciplinaId(String disciplinaId) {
		this.disciplinaId = disciplinaId;
	}
	
	*/
	
	
	public String getNaturezaProblema() {
		return naturezaProblema;
	}
	public void setNaturezaProblema(String naturezaProblema) {
		this.naturezaProblema = naturezaProblema;
	}
	/*
	public String getRelator() {
		return relator;
	}
	public void setRelator(String relator) {
		this.relator = relator;
	}  */
	
	public String getDescricaoProblema() {
		return descricaoProblema;
	}
	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public String getPalavrasChavesProblema() {
		return palavrasChavesProblema;
	}
	public void setPalavrasChavesProblema(String palavrasChavesProblema) {
		this.palavrasChavesProblema = palavrasChavesProblema;
	}
	public int getSolucaoId() {
		return solucaoId;
	}
	public void setSolucaoId(int solucaoId) {
		this.solucaoId = solucaoId;
	}
	/*
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}  */
	
	public String getSolucao() {
		return solucao;
	}
	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}
	public String getAcaoImplementada() {
		return acaoImplementada;
	}
	public void setAcaoImplementada(String acaoImplementada) {
		this.acaoImplementada = acaoImplementada;
	}
	public String getEfetividade() {
		return efetividade;
	}
	public void setEfetividade(String efetividade) {
		this.efetividade = efetividade;
	}
	public String getCustos() {
		return custos;
	}
	public void setCustos(String custos) {
		this.custos = custos;
	}
	public String getAtoresEnvolvidos() {
		return atoresEnvolvidos;
	}
	public void setAtoresEnvolvidos(String atoresEnvolvidos) {
		this.atoresEnvolvidos = atoresEnvolvidos;
	}
	public Double getSimilaridade() {
		return similaridade;
	}
	public void setSimilaridade(Double similaridade) {
		this.similaridade = similaridade;
	}
	

}
