package dk.klintsoe.chessProject.MetaData;

import dk.klintsoe.chessProject.Dao.CalendarRepository;
import dk.klintsoe.chessProject.model.calendar.ChessCalendarEntry;
import dk.klintsoe.chessProject.model.calendar.ChessCalender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class MetaData implements CommandLineRunner {

    @Autowired
    private CalendarRepository calendarRepository;

    @Override
    @Transactional
    public void run(String... strings) throws Exception {

        System.out.println("Running Commands");

        List<ChessCalendarEntry> list = new ArrayList();
        list.add(new ChessCalendarEntry(Calendar.getInstance().getTime(), "Opstart", ChessCalendarEntry.ColorType.noColor, 0));

        ChessCalender chessCalender1718 = new ChessCalender("2017/2018", list);
  //      ChessCalender chessCalender1617 = new ChessCalender("2016/2017", null);

        calendarRepository.save(chessCalender1718);
//        calendarRepository.save(chessCalender1617);


    }
}
