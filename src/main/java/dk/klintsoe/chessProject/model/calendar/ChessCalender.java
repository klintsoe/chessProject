package dk.klintsoe.chessProject.model.calendar;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "Chess_Calender")
public class ChessCalender {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int seasonId;

    private String season;

    @OneToMany(mappedBy = "chessCalender", cascade = CascadeType.ALL)
    private List<ChessCalendarEntry> entryList;

    public ChessCalender(String season, List<ChessCalendarEntry> list) {
        this.season = season;
        this.entryList = list;
    }

    public List<ChessCalendarEntry> getEntryList() {
        return entryList;
    }

}
