package dk.klintsoe.chessProject.model.tournament;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name ="Round")
public class Round {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roundId;

    private int roundNr;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "tournametId")
    private Tournament tournament;

    @OneToMany(mappedBy = "matchId", cascade = CascadeType.ALL)
    public Collection<Match> getMatchList;



}
