package DAO;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import domain.Reuniao;



@Repository
public interface ReuniaoRepository extends  Neo4jRepository<Reuniao, Long>{

		public Reuniao findByName(@Param("nome") String nome);	
}
