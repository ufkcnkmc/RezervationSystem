package com.ufkcnkmc.springboot.thymeleafdemo.controller;

import com.ufkcnkmc.springboot.thymeleafdemo.entity.Reservation;
import com.ufkcnkmc.springboot.thymeleafdemo.repository.ReservationRepository;
import com.ufkcnkmc.springboot.thymeleafdemo.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rezervasyon")
public class ReservationController {
    private final RoomRepository roomRepository; // RoomRepository'nin inject edildiğinden emin olun
    private final ReservationRepository reservationRepository; // ReservationRepository'nin inject edildiğinden emin olun


    @Autowired
    public ReservationController(RoomRepository roomRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/olustur")
    public String rezervasyonForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("rooms", roomRepository.findAll());
        return "rezervasyonForm"; // Thymeleaf sayfa ismi
    }

    @PostMapping("/kaydet")
    public String rezervasyonKaydet(@ModelAttribute("reservation") Reservation reservation) {
        reservationRepository.save(reservation);
        return "redirect:/rezervasyon/olustur"; // Yeni bir rezervasyon oluşturma sayfasına yönlendir
    }
}

