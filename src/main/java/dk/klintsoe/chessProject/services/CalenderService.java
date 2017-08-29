package dk.klintsoe.chessProject.services;

import dk.klintsoe.chessProject.Dao.CalendarRepository;
import dk.klintsoe.chessProject.model.calendar.ChessCalender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalenderService {

    @Autowired
    private CalendarRepository calendarRepository;

    public CalenderService() {

    }

//    public ChessCalender getFullCalendar(String season) {
//       return calendarRepository.findbySeason(season);
//    }

    public List<ChessCalender> getFullCalendar() {
        return calendarRepository.findAll();
    }

}
