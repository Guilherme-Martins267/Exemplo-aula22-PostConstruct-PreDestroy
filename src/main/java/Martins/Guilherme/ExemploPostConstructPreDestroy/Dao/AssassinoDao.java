package Martins.Guilherme.ExemploPostConstructPreDestroy.Dao;

import Martins.Guilherme.ExemploPostConstructPreDestroy.model.Assassino;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Getter @Setter
public class AssassinoDao {

    @Autowired
    private Assassino assassino;

    @PostConstruct
    public void postConstructor() {
        System.out.println("Promissory note successfully created");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Promissory starts in: 1 hour");
    }

}
