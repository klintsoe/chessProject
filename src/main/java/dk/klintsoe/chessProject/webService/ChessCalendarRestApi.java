package dk.klintsoe.chessProject.webService;

import dk.klintsoe.chessProject.model.calendar.ChessCalender;
import dk.klintsoe.chessProject.services.CalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class ChessCalendarRestApi {

    @Autowired
    private CalenderService calenderService;

    @RequestMapping(method = RequestMethod.GET, value = "/{season}")
    public List<ChessCalender> getChessCalendar(@PathVariable String season) {
        List<ChessCalender> chessCalenders = calenderService.getFullCalendar();
        return chessCalenders;
    }


}
