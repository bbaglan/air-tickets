package itse1905.airlinetickets.repository;

import itse1905.airlinetickets.model.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketRepoInter {
    List<Ticket> getAllTicket();
    Optional<Ticket> getTicketByGoingTo(String goingTo);
}
