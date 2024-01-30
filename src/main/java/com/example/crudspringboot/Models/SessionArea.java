package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Table(name = "Session_Area")
@Entity
public class SessionArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Session_AreaId", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "SessionId")
    private Session sessionId;

    @ManyToOne
    @JoinColumn(name = "AreaId")
    private Area areaId;

    @Column(name = "Status", length = 50)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public Session getSessionId() {
        return sessionId;
    }

    public void setSessionId(Session sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}