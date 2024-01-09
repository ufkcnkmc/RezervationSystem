package com.ufkcnkmc.springboot.thymeleafdemo.repository;

import com.ufkcnkmc.springboot.thymeleafdemo.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {

}
