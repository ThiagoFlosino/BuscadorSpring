package domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type="documentoEntidade")
public class ArestaDocumento {
	
	@Id @GeneratedValue
	private Long id;
	
	@Property(name="tipo")
	private String tipo;

	@StartNode
	private Documento documento;

	@EndNode
	private Entidade entidade;
	
	public ArestaDocumento() {
		
	}
	
	public ArestaDocumento(Documento documento, Entidade entidade, String tipo) {
		this.documento = documento;
		this.entidade = entidade;
		this.tipo = tipo;
	}
	
}
