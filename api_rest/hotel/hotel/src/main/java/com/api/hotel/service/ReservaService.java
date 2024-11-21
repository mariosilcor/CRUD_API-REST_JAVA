package com.api.hotel.service;

import com.api.hotel.model.Reserva;
import com.api.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    //Creación de dependencias para tener acceso a todo lo que tenga que ver con el repositorio de Reserva
    @Autowired
    private ReservaRepository reservaRepository;

    //Mostrar reserva
    public List<Reserva> getAllHuespedes(){
        return reservaRepository.findAll(); //Método que ya está definido en este Repositorio para obtener toda la información de esa Tabla.
    }

    //Crear reserva
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva); //Va a recibir una entidad, que en este caso será reserva
    }

    //Editar reserva
    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva); //Va a recibir una entidad, que en este caso será reserva
    }

    //Eliminar reserva, que será un public void porque no va a retornar nada
    public void deleteReservaById(Long id){
        reservaRepository.deleteById(id);
    }
}
