package springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//import javax.persistence.EntityManagerFactory;

//import springboot.services.AccountService;
//import springboot.domainmodels.Account;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.MetadataSources;

//import java.util.List;

@SpringBootApplication(scanBasePackages={
    "springboot.controllers", 
	"springboot.services",
	"springboot.domainmodels",
	"springboot.repository"
})
@EnableJpaRepositories
public class Application {
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Java backend has launched:");

			//final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			//SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
			//Session session = sessionFactory.openSession();

			//session.beginTransaction();
			//List result = session.createQuery( "SELECT a FROM Account a" ).list();
			//for ( Account account : (List<Account>) result ) {
			//	System.out.println( "id: " + account.getId() + ", username: " + account.getUsername() + ", password: " + account.getPassword());
			//}
			//session.getTransaction().commit();
			//session.close();
			
			//System.out.println("END!!!");
		};
	}
}