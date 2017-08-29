package dk.klintsoe.chessProject.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Table(name ="Tournament")
public class Tournament {
    public enum TournamentType{Pokal, monrad, alleModAlle};
    public enum KorrektionType{SonnebornBergerKorrektion, none};

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tournamentID;

    @Column(name = "name")
    private String name;

    @Column(name = "seasonYear")
    private String seasonYear;

    @Column(name = "tournamentType")
    private TournamentType tournamentType;

    @Column(name = "numberOfRounds")
    private int numberOfRounds;

    @Column(name = "korrektionType")
    private KorrektionType korrektionType;

    @OneToMany()
    private Collection<Player> playerList;

    @OneToMany()
    private Collection<Round> roundList;


    public Tournament(String name, String seasonYear, TournamentType tournamentType, int numberOfRound, KorrektionType korrektionType) {
        this.name = name;
        this.seasonYear = seasonYear;
        this.tournamentType = tournamentType;
        this.numberOfRounds = numberOfRound;
        this.korrektionType = korrektionType;
        this.playerList = new ArrayList();
        this.roundList = new ArrayList();
    }


    public String getName() {
        return name;
    }

    public String getSeasonYear() {
        return seasonYear;
    }

    public TournamentType getTournamentType() {
        return tournamentType;
    }

    public int getNumberOfRound() {
        return numberOfRounds;
    }

    public KorrektionType getKorrektionType() {
        return korrektionType;
    }

    public Collection<Player> getPlayerList() {
        return playerList;
    }

    public Collection<Round> getRoundList() {
        return roundList;
    }
}
