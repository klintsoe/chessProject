package dk.klintsoe.chessProject.model.tournament;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name ="Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;

    private String name;

    private int rating;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    public Collection<Player> getPlayerList;

}
