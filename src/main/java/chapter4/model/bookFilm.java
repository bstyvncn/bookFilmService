package chapter4.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class bookFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ticketID;

    @OneToOne
    private String username;

    @ManyToOne
    private String seatsID;

    @OneToOne
    private String scheduleID;
}
