package com.wipro.ats.bdre.md.beans.table;

/**
 * Created by SH324337 on 3/23/2016.
 */
public class SlaBean {

    Integer processId;
    Long currentTime;
    Long avgTime;

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }

    public Long getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(Long avgTime) {
        this.avgTime = avgTime;
    }

}
