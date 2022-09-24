package itse1905.airlinetickets.repository;

import itse1905.airlinetickets.model.CompanyAL;
import itse1905.airlinetickets.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public class TicketRepo implements TicketRepoInter{
    private SessionFactory sessionFactory;

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public List<Ticket> getAllTicket() {
        return sessionFactory.getCurrentSession().createQuery("from Ticket t").list();
    }

    @Override
    public Optional<Ticket> getTicketByGoingTo(String goingTo) {
        return getAllTicket().stream()
                .filter(ticket -> ticket.getGoingTo()
                        .equals(goingTo)).findAny();
    }

}
