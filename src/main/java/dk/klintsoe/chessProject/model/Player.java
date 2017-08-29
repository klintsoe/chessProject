package dk.klintsoe.chessProject.model;


import javax.persistence.*;

@Entity
@Table(name ="Player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerId;

    @OneToOne()
    private Person person;

    private float score;
    private float kooretion;
    private int ranking;



}
