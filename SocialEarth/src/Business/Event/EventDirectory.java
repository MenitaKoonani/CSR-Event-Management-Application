/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import Business.Network.Network;
import Business.Zone.Zone;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Menita Koonani
 */
public class EventDirectory {

    private ArrayList<Event> eventList;
    public static int counter;

    public EventDirectory() {
        eventList = new ArrayList<Event>();
        counter = 2000;
    }

    public ArrayList<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }

    public Event createAndAddEvent(String eventName, Network network, Zone zone, String venue, Date eventDate, int maxAllowed,
            boolean isTransportAvail, Date regStartTime, Date regEndTime,int donation) {
        Event newEvent = new Event();
        newEvent.setEventId(counter++);
        newEvent.setEventName(eventName);
        newEvent.setVenue(venue);
        newEvent.setEventDate(eventDate);
        newEvent.setIsTransportAvail(isTransportAvail);
        newEvent.setMaxMembersAllowed(maxAllowed);
        newEvent.setRegStartDate(regStartTime);
        newEvent.setRegEndDate(regEndTime);
        newEvent.setDonation(donation);
        eventList.add(newEvent);
        return newEvent;
    } 
    
    public void deleteEvent(Event event){
    eventList.remove(event);
    }
}
