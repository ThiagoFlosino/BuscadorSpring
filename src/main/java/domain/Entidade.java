package domain;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
public abstract class Entidade {
		
	@Id @GeneratedValue
	private Long id;
	
	@Property(name="posicao")
	private String posicao;
	
	@Property(name="trecho")
	private String trecho;
	
	@Property(name="numeroCitacoes")
	private Integer numeroCitacoes;
	
	@Property(name="numeroRelacoes")
	private Integer numeroRelacoes;
	
	@Property(name="tipoEntidade")
	private String tipoEntidade;
	
	@Relationship(direction = Relationship.INCOMING)
	private List<ArestaDocumento> documentos;
	
		
	public Entidade(Long id, String posicao, String techo, Integer numeroCitacoes, Integer numeroRelacoes) {
		super();
		this.id = id;
		this.posicao = posicao;
		this.trecho = techo;
		this.numeroCitacoes = numeroCitacoes;
		this.numeroRelacoes = numeroRelacoes;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	public String getTrecho() {
		return trecho;
	}
	
	public void setTrecho(String trecho) {
		this.trecho = trecho;
	}
	
	public Integer getNumeroCitacoes() {
		return numeroCitacoes;
	}
	
	public void setNumeroCitacoes(Integer numeroCitacoes) {
		this.numeroCitacoes = numeroCitacoes;
	}
	
	public Integer getNumeroRelacoes() {
		return numeroRelacoes;
	}
	
	public void setNumeroRelacoes(Integer numeroRelacoes) {
		this.numeroRelacoes = numeroRelacoes;
	}

	public List<ArestaDocumento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<ArestaDocumento> documentos) {
		this.documentos = documentos;
	}

	public String getTipoEntidade() {
		return tipoEntidade;
	}

	public void setTipoEntidade(String tipoEntidade) {
		this.tipoEntidade = tipoEntidade;
	}

}
