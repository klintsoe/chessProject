package dk.klintsoe.chessProject.model.tournament;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name ="Player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "personId")
    private Person person;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "tournamentId")
    private Tournament tournament;

    private float score;
    private float kooretion;
    private int ranking;


    @OneToMany(mappedBy = "whitePlayer", cascade = CascadeType.ALL)
    public Collection<Match> getBlackMatchList;


    @OneToMany(mappedBy = "blackPlayer", cascade = CascadeType.ALL)
    public Collection<Match> getWhiteMatchList;


}
