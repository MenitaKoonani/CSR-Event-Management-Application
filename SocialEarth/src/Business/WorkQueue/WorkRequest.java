/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private UserAccount userAccount;
    private String eventVenue;
    private int workRequestId;
    private int donationFromEvent;
    private int eventBudget;
    private int transportBudget;
    private boolean needTransport;

    public WorkRequest() {
        requestDate = new Date();
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getWorkRequestId() {
        return workRequestId;
    }

    public void setWorkRequestId(int workRequestId) {
        this.workRequestId = workRequestId;
    }

    public int getDonationFromEvent() {
        return donationFromEvent;
    }

    public void setDonationFromEvent(int donationFromEvent) {
        this.donationFromEvent = donationFromEvent;
    }

    public int getEventBudget() {
        return eventBudget;
    }

    public void setEventBudget(int eventBudget) {
        this.eventBudget = eventBudget;
    }

    public int getTransportBudget() {
        return transportBudget;
    }

    public void setTransportBudget(int transportBudget) {
        this.transportBudget = transportBudget;
    }

    public boolean getNeedTransport() {
        return needTransport;
    }

    public void setNeedTransport(boolean needTransport) {
        this.needTransport = needTransport;
    }

    @Override
    public String toString() {
        return String.valueOf(this.workRequestId);
    }
}
