package br.ufam.rest.model.recuperacao;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

import javax.swing.JOptionPane;

import br.ufam.rest.model.Caso;
import br.ufam.rest.model.Descricao;
import br.ufam.rest.model.Solucao;

import jcolibri.cbrcore.CBRCase;
import jcolibri.method.retrieve.RetrievalResult;

/*
 * Classe que implementa a etapa de Recuperacao
 * 
 * */

public class Recuperacao {
	
	private Collection<RetrievalResult> eval;
	private Collection<CBRCase> casos_selecionados;
	private List<RetrievalResult> casos;
	private int k;
	
	public Recuperacao(Collection<RetrievalResult> eval, Collection<CBRCase> casos_selecionados, int k) {
		
		casos = new ArrayList<RetrievalResult>();
		this.k = k;
		this.casos_selecionados = casos_selecionados;
		this.eval = eval;
		
		for(RetrievalResult recuperacao: this.eval) {
			if(this.casos_selecionados.contains(recuperacao.get_case())) {
				this.casos.add(recuperacao);
			}
		}
		
	}
	//responsavel por imprimir o resultado
	
	public void exibirCasosRecuperado() 
	{
		for(int i=0;i<this.k;i++) 
		{
			Descricao desc = getCaseDescription(i);
			Solucao sol = getSolucaoCaso(i);
			//if(getSimilaridade(i) == 0.0){
				//JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum caso similar");
			    //System.exit(0); // Finaliza o programa - Isso deve ser feito de outra forma
			//}else{
			String informacoes = "                 <<< ETAPA DE RECUPERACAO >>> \n\n O caso passado mais similar ao novo caso recuperado da base de casos\n"+
			"Valor da Similaridade:"+getSimilaridade(i) +
			" \n Caso iD: "+ getCaso(i).getID() +
			";\n Tema: "+desc.getNaturezaProblema()+
			//";\n Topico: "+desc.getDateCreated()+
			";\n Polo (ID): "+desc.getPoloId()+
			";\n Relator (ID): "+desc.getRelatorId()+
			//";\n Descricao do proglema: "+desc.getTurmaId()+
			//";//\n Natureza do problema: "+desc.getCursoId()+
			//";\n Natureza do problema: "+desc.getDisciplinaId()+
			//";\n Natureza do problema: "+desc.getQtdeAlunos()+
			";\n Natureza do problema: "+desc.getDescricaoProblema()+
			";\n Natureza do problema: "+desc.getProblema()+
			";\n Natureza do problema: "+desc.getPalavrasChavesProblema()+			
			" \n \n  ------ Solucao Empregada ------- \n"+
			//"\nPolo: "+sol.getDiagnostico()+
			"\n"+"Solução: "+sol.getSolucao()+
			"\n"+"Palavras Chaves Solução: "+sol.getPalavrasChavesSolucao()+
			"\n"+"Ação implementada: "+sol.getAcaoImplementada()+
			"\n"+"Efetividade: "+sol.getEfetividade()+
			"\n"+"Objeto de Aprendizagem: "+sol.getSolucaoImplementada()+
			"\n"+"Custos: "+sol.getCustos()+
			"\n"+"Objeto de Aprendizagem: "+sol.getImpactoPedagogico()+		
			"\n"+"Atores Envolvidos: "+sol.getAtoresEnvolvidos();
			JOptionPane.showMessageDialog(null, informacoes);
		}	
			
		//}
	}
	
	//responsavel por setar o Caso e poder voltar via json para PHP
		public Caso exibirCasosRecuperado2() {
			System.out.println("\n\n **************Entrei em exibir 2********************** \n\n");
			Caso caso = new Caso();
			for(int i=0;i<this.k;i++) {
				System.out.println("\n\n ......Entrei no for \n\n");
				Descricao desc = getCaseDescription(i);				
				Solucao sol = getSolucaoCaso(i);				
				System.out.println("\n\n ......Entrei no for  Ates de Setar\n\n");
				String idString = (getCaso(i).getID().toString());
				System.out.println("\n\n ......Entrei no for  idString\n\n"+idString);
				int idInt = Integer.parseInt(idString);
				System.out.println("\n\n ......Entrei no for  idInt\n\n"+idInt);
				caso.setCaseId(idInt);
				caso.setNaturezaProblema(desc.getNaturezaProblema());
				//caso.setDateCreated(desc.getDateCreated());
				//caso.setRelator(desc.getRelator());
				//caso.setCursoId(desc.getCursoId());
				//caso.setDisciplinaId(desc.getDisciplinaId());
				caso.setPoloId(desc.getPoloId());
				caso.setRelatorId(desc.getRelatorId());
				caso.setDescricaoProblema(desc.getDescricaoProblema());
				caso.setProblema(desc.getProblema());
				caso.setPalavrasChavesProblema(desc.getPalavrasChavesProblema());
				System.out.println("\n\n ......Entrei no for  Antes de SolucaoID\n\n"+idInt);
				caso.setSolucaoId(idInt);
				//System.out.println("\n\n ......Entrei no for  Antes de Diagnostico\n\n"+idInt);
				//caso.setDiagnostico(sol.getDiagnostico());
				//System.out.println("\n\n ......Entrei no for :Diagnostico\n\n"+sol.getDiagnostico());
				caso.setSolucao(sol.getSolucao());
				caso.setAcaoImplementada(sol.getAcaoImplementada());
				caso.setEfetividade(sol.getEfetividade());
				caso.setPalavrasChavesProblema(sol.getPalavrasChavesSolucao());
				System.out.println("\n\n ......Entrei no for :Palavras Chaves\n\n"+sol.getPalavrasChavesSolucao());

				caso.setSolucaoImplementada (sol.getSolucaoImplementada());
				caso.setImpactoPedagogico(sol.getImpactoPedagogico());
				caso.setCustos(sol.getCustos());
				caso.setAtoresEnvolvidos(sol.getAtoresEnvolvidos());
				System.out.println("\n\n ......Entrei no for  Antes de Similaridade\n\n"+idInt);
				caso.setSimilaridade(getSimilaridade(i));
				System.out.println("\n\n ......Entrei no for Depois de Setar \n\n");
			}
			System.out.println("\n\n ......Vou dar return\n\n");
			return caso;
			//}
		}
	
	public CBRCase getCaso(int i) {
		RetrievalResult recuperacao = casos.get(i);	
		//System.out.println(recuperacao);
		CBRCase _caso = recuperacao.get_case();
		//System.out.println(_caso);
		return _caso;
	}

	/*
	 * Parte da Solucao do Problema  
	 */
	/*
	public String getDiagnostico(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getDiagnostico();
	}  */
	
	public String getSolucao(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getSolucao();
	} 
	
	public String getPalavrasChavesSolucao(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getPalavrasChavesSolucao();
	}
	 
	public String getAcaoImplementada(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getAcaoImplementada();
	}

	public String getSolucaoImplementada(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getSolucaoImplementada();
	}
	
	public String getCustos(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getCustos();
	}
	
	public String getEfetividade(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getEfetividade();
	}
	
	public String getImpactoPedagogico(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getImpactoPedagogico();
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
	
	public String getPoloId(int _caso) {
		Descricao desc  = getCaseDescription(_caso);
		return desc.getPoloId();
	} 
	
	

	
	public String getRelatorId(int _caso) {
		Descricao desc  = getCaseDescription(_caso);
		return desc.getRelatorId();
	}  
/*
	public String getTurmaId(int _caso) {
		Descricao desc  = getCaseDescription(_caso);
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

	public Descricao getCaseDescription(int _casoNumero) {
		CBRCase _case = getCaso(_casoNumero);
		return (Descricao) _case.getDescription();
	}
	
	public Solucao getSolucaoCaso(int _casoNumero) {
		CBRCase _case = getCaso(_casoNumero);
		return (Solucao) _case.getSolution();
	}
	
	public double getSimilaridade(int _caso) {
		RetrievalResult rr = casos.get(_caso);
		return rr.getEval();
	}
}