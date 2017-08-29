package dk.klintsoe.chessProject.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name ="Round")
public class Round {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roundId;

    @Column(name = "roundNr")
    private int roundNr;

    @OneToMany()
    @JoinTable()
 //   @GeneratedValue(generator = "")
    public Collection<Match> getMatchList;



}
