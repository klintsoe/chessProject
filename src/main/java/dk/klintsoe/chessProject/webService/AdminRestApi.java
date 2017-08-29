package dk.klintsoe.chessProject.webService;

import dk.klintsoe.chessProject.Dao.JpaHibernateService;
import dk.klintsoe.chessProject.MetaData.MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AdminRestApi {


    @Autowired
    private JpaHibernateService jpaHibernateService;

//    @RequestMapping(method = RequestMethod.GET, value ="/")
//    public String welcome() {
//        return "Welkommen til the Chess world:" + jpaHibernateService.databaseConnectionActive();
//    }

//    @RequestMapping(method = RequestMethod.GET, value ="/databaseCon")
//    public String testDatabaseConnection() {
//        return "Databaseconnection active:" + jpaHibernateService.databaseConnectionActive();
//    }



}
