package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public class UserSessions implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sessionId;
    @NotNull
    private Integer userId;
    @NotNull
    private Date sessionStart;
    private Date sessionStop;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSessionStart() {
        return sessionStart;
    }

    public void setSessionStart(Date sessionStart) {
        this.sessionStart = sessionStart;
    }

    public Date getSessionStop() {
        return sessionStop;
    }

    public void setSessionStop(Date sessionStop) {
        this.sessionStop = sessionStop;
    }
}
