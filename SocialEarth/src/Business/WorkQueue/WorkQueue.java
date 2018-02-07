/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raghavi
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public RoleWorkRequest addNewRequest(RoleWorkRequest newRequest) {
        for (WorkRequest eachRequest : workRequestList) {
            if (eachRequest.getWorkRequestId() == newRequest.getWorkRequestId()) {
                workRequestList.remove(eachRequest);
                break;
            }
        }
        workRequestList.add(newRequest);
        return newRequest;
    }
}
