import org.neo4j.ogm.session.SessionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.Neo4jSessionFactory;
import domain.Reuniao;

@RestController
public class Testes {
	
	@RequestMapping("/")
	public Iterable<Reuniao> teste(){
		SessionFactory conexao = new Neo4jSessionFactory().sessionFactory();
		
		conexao.openSession();
		testeRepo repo = new testeRepo();
		Iterable<Reuniao> t = repo.repo.findAll();
		conexao.close();
		return t;
		
	}


}
