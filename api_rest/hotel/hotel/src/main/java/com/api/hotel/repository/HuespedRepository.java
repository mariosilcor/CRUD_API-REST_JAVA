package com.api.hotel.repository;

import com.api.hotel.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HuespedRepository extends JpaRepository<Huesped, Long> { //JpaRepository va a recibir un huésped y un tipo de dato que será su Id, en este caso es de tipo Long
}
