package dk.klintsoe.chessProject.model;


import javax.persistence.*;

@Entity
@Table(name ="Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;

    @Column(name = "name")
    private String name;

    @Column(name = "raking")
    private int rating;

}
