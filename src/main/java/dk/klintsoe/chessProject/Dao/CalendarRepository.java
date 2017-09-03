package dk.klintsoe.chessProject.Dao;

import dk.klintsoe.chessProject.model.calendar.ChessCalender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarRepository extends JpaRepository<ChessCalender, Integer>{

    List<ChessCalender> findBySeason(String season);

}
