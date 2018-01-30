package domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;


@RelationshipEntity(type = "entidadeEntidade")
public class ArestaEntidades {

	@Id @GeneratedValue
	private Long id;
	
	@Property
	private String tipo;

	@StartNode
	private Entidade entidadeInicio;

	@EndNode
	private Entidade entidadeFim;
	
	public ArestaEntidades() {
		
	}
	
	public ArestaEntidades(Entidade entidadeInicio, Entidade entidadeFim, String tipo) {
		this.entidadeInicio = entidadeInicio;
		this.entidadeFim = entidadeFim;
		this.tipo = tipo;
	}
}
