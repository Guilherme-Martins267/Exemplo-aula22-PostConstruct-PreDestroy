package Martins.Guilherme.ExemploPostConstructPreDestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Assassino {

    private String name;

    public Assassino(){
        System.out.println("Class assassin");
    }
}
