package DAO;

import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.config.ConfigurationSource;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;


//@EnableTransactionManagement
public class Neo4jSessionFactory {


  //  @Bean
    public SessionFactory sessionFactory() {
        // with domain entity base package(s)
        return new SessionFactory(configuration(), "domain");
    }

    //@Bean
    public Configuration configuration() {
        ConfigurationSource properties = new ClasspathConfigurationSource("ogm.properties");
        Configuration configuration = new Configuration.Builder(properties).uri("bolt://localhost")
                .credentials("neo4j", "root")
                .build();
        return configuration;
    }

//    @Bean
    public Neo4jTransactionManager transactionManager() {
        return new Neo4jTransactionManager(sessionFactory());
    }

}