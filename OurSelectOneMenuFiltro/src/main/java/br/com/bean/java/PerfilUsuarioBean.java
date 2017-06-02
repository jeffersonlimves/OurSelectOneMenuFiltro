package br.com.bean.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="perfilUsuarioBean")
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String profissao;
	private TipoProfissao tipoProf;
	private Map<String,String> listProfissoes;
	private List<TipoTimeFutebol> listTipoTimeFutebol;
	
	public static final List<Interesse> INTERESSES = new ArrayList<Interesse>(); 
	
	
	static {
		//INTERESSES.add(new Interesse(String descricao, String nomeIcone));
		INTERESSES.add(new Interesse("Esportes",   "esportes"));
		INTERESSES.add(new Interesse("Computação", "computacao"));
		INTERESSES.add(new Interesse("Cinema",  "cinema"));
		INTERESSES.add(new Interesse("Leitura", "leitura"));
	}
	
	private Interesse interesse;
	
	
	public void atualizar(){
		System.out.println("Nome="+this.nome);
		System.out.println("Tipo profissao="+this.tipoProf);
		
		if(interesse!=null){
			System.out.println("Interesse>>>>>> Descricao="+interesse.getDescricao()+" Nome="+interesse.getNomeIcone());
		}else{
			System.out.println("Interesse foi null");
		}
		
		if(tipoProf instanceof TipoProfissao){
			System.out.println("O que veio eh realmente um enum!");
			System.out.println("TipoProfissao="+tipoProf);
		}

		if(tipoProf == null ){
			System.out.println("O que veio eh realmente um enum!="+tipoProf);
			System.out.println("TipoProfissao="+tipoProf);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado"));
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

//	public List<TipoProfissao> getListTipoProfissao() {
//		if(listTipoProfissao == null){
//			listTipoProfissao = new  ArrayList<TipoProfissao>();
//			for (TipoProfissao tipoProfissao : TipoProfissao.values()) {
//				listTipoProfissao.add(tipoProfissao);
//				
//			}
//		}
//		return listTipoProfissao;
//	}
//
//	public void setListTipoProfissao(List<TipoProfissao> listTipoProfissao) {
//		this.listTipoProfissao = listTipoProfissao;
//	}
	
	public List<TipoTimeFutebol> getListTipoTimeFutebol() {
		if(listTipoTimeFutebol == null){
			listTipoTimeFutebol = new  ArrayList<TipoTimeFutebol>();
			for (TipoTimeFutebol time : TipoTimeFutebol.values()) {
				listTipoTimeFutebol.add(time);
				
			}
		}
		return listTipoTimeFutebol;
	}

	public void setListTipoTimeFutebol(List<TipoTimeFutebol> listTipoTimeFutebol) {
		this.listTipoTimeFutebol = listTipoTimeFutebol;
	}

	public TipoProfissao getTipoProf() {
		return tipoProf;
	}

	public void setTipoProf(TipoProfissao tipoProf) {
		this.tipoProf = tipoProf;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}


	public Map<String, String> getListProfissoes() {
		
		if(listProfissoes == null){
			listProfissoes = new  HashMap<String,String>();
			
			listProfissoes.put("Studante",  "STUDANTE");//chave==>label,valor==>o que sera salvo
			listProfissoes.put("Professor", "PROFESSOR");
			listProfissoes.put("Diretor",   "DIRETOR");
			listProfissoes.put("Supervisor","SUPERVISOR");
		}
		
		return listProfissoes;
	}

	public void setListProfissoes(Map<String, String> listProfissoes) {
		this.listProfissoes = listProfissoes;
	}

	//=================================================================
//	public static List<Interesse> getInteresses() {//o metodo static nao deve ser usuado
//		return INTERESSES;
//	}
	public List<Interesse> getInteresses() {
		return INTERESSES;
	}
	
	

}
