package itse1905.airlinetickets.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
public class CompanyAL implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "COMPANY_ID")
    private int compId;
    @Column(name = "COMPANY_NAME")
    private String compName;
    @Column(name = "COMPANY_COUTRY")
    private String compCountry;
    @ManyToOne
    @JoinColumn(name = "USER_AL")
    private UserAL userAL;

    public CompanyAL(int compId, String compName, String compCountry, UserAL userAL) {
        this.compId = compId;
        this.compName = compName;
        this.compCountry = compCountry;
        this.userAL = userAL;
    }

    @Override
    public String toString() {
        return "CompanyAL{" +
                "compId=" + compId +
                ", compName='" + compName + '\'' +
                ", compCountry='" + compCountry + '\'' +
                ", userAL=" + userAL +
                '}';
    }
}
