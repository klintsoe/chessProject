package dk.klintsoe.chessProject.model.tournament;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;



@Entity
@Table(name="Match")
public class Match {

    public enum MatchResult{WhiteWin, BlackWin, Remis, NotPlayed};
    public enum MatchStatus{NotPlayed, NotPlanned, Cancelled, Played};

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matchId;

    @ManyToOne
    @JoinColumn(name = "whitePlayerId")
    private Player whitePlayer;

    @ManyToOne
    @JoinColumn(name = "blackPlayerId")
    private Player blackPlayer;

    private MatchStatus matchstatus;

    private MatchResult result;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "roundId")
    private Round round;





}
