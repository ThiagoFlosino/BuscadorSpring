package DAO;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories("org.neo4j.cineasts.repository")
@EnableTransactionManagement
@ComponentScan("org.neo4j.cineasts")
public class PersistenceContext extends Neo4jConfiguration {
	

}
