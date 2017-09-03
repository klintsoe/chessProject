package dk.klintsoe.chessProject.webService;

import dk.klintsoe.chessProject.model.tournament.Player;
import dk.klintsoe.chessProject.model.tournament.Tournament;
import dk.klintsoe.chessProject.services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TournamentRestApi {

    private final String seasonPath = "/season";
    private final String tournamentPath = "/tournaments";
    private final String playerPath = "/players";
    private final String matchPath = "/matchs";
    private final String roundPath = "/rounds";

    @Autowired
    private TournamentService tournamentService;

    @RequestMapping(method = RequestMethod.GET, value =tournamentPath)
    public Collection listAllTournaments(String season) {
        return tournamentService.getTournaments(season);
    }

    @RequestMapping(method = RequestMethod.GET, value = tournamentPath+"/{tournament}")
    public Tournament findTournament(String tournament) {
        return new Tournament("testing","2017/2018", Tournament.TournamentType.alleModAlle, 8, Tournament.KorrektionType.SonnebornBergerKorrektion);
    }


    @RequestMapping(method = RequestMethod.GET, value = tournamentPath+"/{tournament}"+playerPath) //param: show matchdata
    public Player greeting(@RequestParam(value="showMatchData", defaultValue="false") String matchdatashow) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = tournamentPath+"/{tournament}"+playerPath + "/{playerId}") //param: show matchdata
    public Player greeting2(@RequestParam(value="showMatchData", defaultValue="false") String matchdatashow) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = tournamentPath+"/{tournament}"+roundPath) //param: show matchdata
    public Player greetindg2(@RequestParam(value="showMatchData", defaultValue="false") String matchdatashow) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = tournamentPath+"/{tournament}"+roundPath+ "/{round}") //param: show matchdata
    public Player greetsinddg2(@RequestParam(value="showMatchData", defaultValue="false") String matchdatashow) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = tournamentPath+"/{tournament}"+roundPath+ "/{round}" + matchPath) //param: show matchdata
    public Player greetinddg2(@RequestParam(value="showMatchData", defaultValue="false") String matchdatashow) {
        return null;
    }


}
