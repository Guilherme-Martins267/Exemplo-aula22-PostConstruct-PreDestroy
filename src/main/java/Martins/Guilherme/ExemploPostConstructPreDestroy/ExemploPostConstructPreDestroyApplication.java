package Martins.Guilherme.ExemploPostConstructPreDestroy;

import Martins.Guilherme.ExemploPostConstructPreDestroy.Dao.AssassinoDao;
import Martins.Guilherme.ExemploPostConstructPreDestroy.model.Assassino;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploPostConstructPreDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructPreDestroyApplication.class, args);

		AssassinoDao assassinoDao = applicationContext.getBean(AssassinoDao.class);
		assassinoDao.setAssassino(new Assassino("John Wich"));

		System.out.println("Promissory note of a assassin" + assassinoDao);
		System.out.println("Assassin" + assassinoDao.getAssassino());
	}

}
