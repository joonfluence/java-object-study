package object._01_ticket;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AudienceTest {
    @DisplayName("관객이 초대장을 이미 가지고 있는 경우, 티켓을 보유하고 있어야 한다.")
    @Test
    void test(){
        // given
        Ticket ticket = new Ticket();
        Invitation invitation = new Invitation();
        Bag bag = new Bag(50000L, invitation);
        Audience audience = new Audience(bag);

        // when
        TicketOffice ticketOffice = new TicketOffice(5000L, ticket);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);
        theater.enter(audience);

        // then
        Assert.assertTrue(audience.getBag().hasTicket());
    }

    @DisplayName("관객이 초대장을 가지고 있지 않는 경우, 티켓을 구매하여야 한다.")
    @Test
    void test_1(){
        // given
        Ticket ticket = new Ticket(5000L);
        Bag bag = new Bag(50000L);
        Audience audience = new Audience(bag);
        Long amount = audience.getBag().getAmount();

        // when
        TicketOffice ticketOffice = new TicketOffice(5000L, ticket);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);
        theater.enter(audience);

        // then
        Assert.assertTrue(audience.getBag().getAmount().equals(amount - ticket.getFee()));
        Assert.assertTrue(audience.getBag().hasTicket());
    }
}