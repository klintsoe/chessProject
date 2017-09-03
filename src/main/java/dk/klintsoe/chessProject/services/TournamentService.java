package dk.klintsoe.chessProject.services;

import dk.klintsoe.chessProject.Dao.JpaHibernateService;
import dk.klintsoe.chessProject.model.tournament.Tournament;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TournamentService {

    Logger logger = LoggerFactory.getLogger(TournamentService.class);

    @Autowired
    private JpaHibernateService jpaHibernateService;

    public Collection<Tournament> getTournaments(String season) {
        Collection<Tournament> tournamentList = jpaHibernateService.findAllTournements();
        return tournamentList;
    }


}
