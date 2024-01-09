
package com.ufkcnkmc.springboot.thymeleafdemo.repository;

import com.ufkcnkmc.springboot.thymeleafdemo.entity.Reservation;
import com.ufkcnkmc.springboot.thymeleafdemo.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
