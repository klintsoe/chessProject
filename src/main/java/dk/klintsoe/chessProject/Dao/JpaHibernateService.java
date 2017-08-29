package dk.klintsoe.chessProject.Dao;

import dk.klintsoe.chessProject.model.Tournament;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TooManyListenersException;

@Repository
public class JpaHibernateService {

    private final String findAllTournamentQuery = "";

//    @PersistenceContext
//    private EntityManager entityManager;


public Collection findAllTournements() {

    //entityManager.find(Tournament.class, );

    Collection<Tournament> tournamentList = new ArrayList();
    tournamentList.add(new Tournament("Efterårtiurnering", "2017/2018", Tournament.TournamentType.alleModAlle, 8, Tournament.KorrektionType.none));
    tournamentList.add(new Tournament("Pokal", "2017/2018", Tournament.TournamentType.alleModAlle, 17, Tournament.KorrektionType.none));
    tournamentList.add(new Tournament("VinterTurnering", "2017/2018", Tournament.TournamentType.monrad, 9, Tournament.KorrektionType.SonnebornBergerKorrektion));
    return tournamentList;
    }

}


//package com.mycuteblog.dao.impl;
//
//        import com.mycuteblog.dao.ApiRequestDao;
//        import com.mycuteblog.model.ApiRequest;
//        import org.springframework.stereotype.Repository;
//
//        import javax.persistence.EntityManager;
//        import javax.persistence.PersistenceContext;
//
//@Repository
//public class ApiRequestDaoImpl implements ApiRequestDao {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void create(ApiRequest apiRequest) {
//        entityManager.persist(apiRequest);
//    }
//
//    @Override
//    public void update(ApiRequest apiRequest) {
//        entityManager.merge(apiRequest);
//    }
//
//    @Override
//    public ApiRequest getApiRequestById(long id) {
//        return entityManager.find(ApiRequest.class, id);
//    }
//
//    @Override
//    public void delete(long id) {
//        ApiRequest apiRequest = getApiRequestById(id);
//        if (apiRequest != null) {
//            entityManager.remove(apiRequest);
//        }
//    }
//
//
//}



