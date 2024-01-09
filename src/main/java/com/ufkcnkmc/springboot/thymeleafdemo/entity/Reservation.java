package com.ufkcnkmc.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    // Diğer rezervasyon özellikleri

    @ManyToOne
    @JoinColumn(name = "room_id",nullable = false)
    private Room room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
