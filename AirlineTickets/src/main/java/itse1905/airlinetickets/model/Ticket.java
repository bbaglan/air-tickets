package itse1905.airlinetickets.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ticket")
@Data
@NoArgsConstructor
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "TICKET_ID")
    private int ticketId;
    @Column(name = "GOING_TO")
    private String goingTo;
    @Column(name = "COME_FROM")
    private String comeFrom;
    //private Date date;
    @Column(name = "TIME")
    private String time;
    @Column(name = "PRICE")
    private int price;
    @ManyToOne
    @JoinColumn(name = "USER_AL")
    private UserAL userAL;

    public Ticket(int ticketId, String goingTo, String comeFrom, String time, int price, UserAL userAL) {
        this.ticketId = ticketId;
        this.goingTo = goingTo;
        this.comeFrom = comeFrom;
        this.time = time;
        this.price = price;
        this.userAL = userAL;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", goingTo='" + goingTo + '\'' +
                ", comeFrom='" + comeFrom + '\'' +
                ", time='" + time + '\'' +
                ", price=" + price +
                ", userAL=" + userAL +
                '}';
    }
}
