package dk.klintsoe.chessProject.model;

import javax.persistence.*;

@Entity
@Table(name="Match")
public class Match {
    public enum ChessColor{White, Black};
    public enum MatchResult{WhiteWin, BlackWin, Remis, NotPlayed};
    public enum MatchStatus{NotPlayed, NotPlanned, Cancelled, Played};

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matchId;

    @OneToOne()
    private Player whitePlayer;

    @OneToOne()
    private Player blackPlayer;

    @Column(name = "status")
    private MatchStatus matchstatus = MatchStatus.NotPlanned;

    @Column(name = "result")
    private MatchResult result = MatchResult.NotPlayed;






}
