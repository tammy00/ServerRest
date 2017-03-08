package br.ufam.rest.model;



import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;


public class Solucao implements CaseComponent{
	
	int solucaoId;
	//String diagnostico;
	String solucao;
	String palavrasChavesSolucao;
	String acaoImplementada;
	String efetividade; 
	String solucaoImplementada;
	String custos;
	String impactoPedagogico;
	String atoresEnvolvidos;

	
	public Attribute getIdAttribute() {
		return new Attribute("solucaoId",this.getClass());
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


	public String getPalavrasChavesSolucao() {
		return palavrasChavesSolucao;
	}


	public void setPalavrasChavesSolucao(String palavrasChavesSolucao) {
		this.palavrasChavesSolucao = palavrasChavesSolucao;
	}


	public String getAcaoImplementada() {
		return acaoImplementada;
	}


	public void setAcaoImplementada(String acaoImplementada) {
		this.acaoImplementada = acaoImplementada;
	}


	public String getSolucaoImplementada() {
		return solucaoImplementada;
	}


	public void setSolucaoImplementada(String solucaoImplementada) {
		this.solucaoImplementada = solucaoImplementada;
	}


	public String getCustos() {
		return custos;
	}


	public void setCustos(String custos) {
		this.custos = custos;
	}


	public String getImpactoPedagogico() {
		return impactoPedagogico;
	}


	public void setImpactoPedagogico(String impactoPedagogico) {
		this.impactoPedagogico = impactoPedagogico;
	}


	public String getAtoresEnvolvidos() {
		return atoresEnvolvidos;
	}


	public String getEfetividade() {
		return efetividade;
	}


	public void setEfetividade(String efetividade) {
		this.efetividade = efetividade;
	}


	public void setAtoresEnvolvidos(String atoresEnvolvidos) {
		this.atoresEnvolvidos = atoresEnvolvidos;
	}
 	

}
