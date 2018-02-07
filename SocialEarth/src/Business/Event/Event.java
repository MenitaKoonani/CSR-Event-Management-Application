/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import Business.Network.Network;
import Business.Zone.Zone;
import java.util.Date;

/**
 *
 * @author Menita Koonani
 */
public class Event {

    private int eventId;
    private String eventName;
    private Network network;
    private Zone zone;
    private Date eventDate;
    private int maxMembersAllowed;
    private boolean isTransportAvail;
    private Date regStartDate;
    private Date regEndDate;
    private String venue;
    private int donation;

    public Event() {
        zone = new Zone();
        network = new Network();
        regStartDate = new Date();
        regEndDate = new Date();
        eventDate = new Date();
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getMaxMembersAllowed() {
        return maxMembersAllowed;
    }

    public void setMaxMembersAllowed(int maxMembersAllowed) {
        this.maxMembersAllowed = maxMembersAllowed;
    }

    public boolean isTransportAvail() {
        return isTransportAvail;
    }

    public void setIsTransportAvail(boolean isTransportAvail) {
        this.isTransportAvail = isTransportAvail;
    }

    public Date getRegStartDate() {
        return regStartDate;
    }

    public void setRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
    }

    public Date getRegEndDate() {
        return regEndDate;
    }

    public void setRegEndDate(Date regEndDate) {
        this.regEndDate = regEndDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public int getDonation() {
        return donation;
    }

    public void setDonation(int donation) {
        this.donation = donation;
    }
    
    @Override
    public String toString() {
        return this.eventName;
    }
}
