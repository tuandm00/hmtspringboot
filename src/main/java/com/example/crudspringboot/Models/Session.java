package com.example.crudspringboot.Models;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;

@Table(name = "\"Session\"")
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SessionId", nullable = false)
    private Integer id;

    @Column(name = "CreateDate")
    private LocalDate createDate;

    @Column(name = "StartTime")
    private Instant startTime;

    @Column(name = "EndTime")
    private Instant endTime;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "\"UserId\"")
    private User userId;

    @Column(name = "Status", length = 50)
    private String status;

    @Column(name = "SessionType", length = 50)
    private String sessionType;

    @Column(name = "SessionName", length = 50)
    private String sessionName;

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}