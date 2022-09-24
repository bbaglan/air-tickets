package itse1905.airlinetickets.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "userAl")
@org.hibernate.annotations.NamedQueries({
        @org.hibernate.annotations.NamedQuery(name = "userAl.findById",
                query = "select distinct u from UserAL u " +
                        "left join fetch u.tickets t " +
                        "left join fetch u.companyALS c " +
                        "where u.id = :id"),
        @org.hibernate.annotations.NamedQuery(name = "userAl.findAllWithTicket",
                query = "select distinct u from UserAL u " +
                        "left join fetch u.tickets t " +
                        "left join fetch u.companyALS c")
})
@Data
@NoArgsConstructor
public class UserAL implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_ID")
    private int userId;
    @Column(name = "FIRST_NAME")
    private String fname;
    @Column(name = "LAST_NAME")
    private String lname;
    @Column(name = "AGE")
    private int age;
    @Column(name = "CITIZENSHIP")
    private String citizenship;
    @OneToMany(mappedBy = "userAl", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ticket> tickets = new HashSet<>();
    @OneToMany(mappedBy = "userAl", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CompanyAL> companyALS = new HashSet<>();

    public UserAL(int userId, String fname, String lname, int age,
                  String citizenship, Set<Ticket> tickets, Set<CompanyAL> companyALS) {
        this.userId = userId;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.citizenship = citizenship;
        this.tickets = tickets;
        this.companyALS = companyALS;
    }

    @Override
    public String toString() {
        return "UserAL{" +
                "userId=" + userId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", citizenship='" + citizenship + '\'' +
                ", tickets=" + tickets +
                ", companyALS=" + companyALS +
                '}';
    }

}
