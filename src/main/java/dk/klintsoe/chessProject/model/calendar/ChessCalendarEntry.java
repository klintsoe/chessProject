package dk.klintsoe.chessProject.model.calendar;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Chess_Calendar_Entry")
public class ChessCalendarEntry {

    public enum ColorType {blue, green, noColor};

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private Date actionDate;
    private String actionText;
    private ColorType colorType;
    private int dateOrder;

    @ManyToOne(cascade = CascadeType.ALL)
    @NotNull
    @JoinColumn(name = "seasonId")
    private ChessCalender chessCalender;

    public ChessCalendarEntry(Date actionDate, String actionText, ColorType colorType, int dateOrder) {
        this.actionDate = actionDate;
        this.actionText = actionText;
        this.colorType = colorType;
        this.dateOrder = dateOrder;
    }
}
