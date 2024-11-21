package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//En esta Clase vamos a crear toda la información que va a manejar nuestro Huésped, ya sea obtener todos los huéspedes, crear un huésped, editar un huésped, eliminar un huésped, etc.
@Service
public class HuespedService {

    //Creación de dependencias para tener acceso a todo lo que tenga que ver con el repositorio de Huésped
    @Autowired
    private HuespedRepository huespedRepository;

    //Creación del primer Método que va a mostrar a los Huéspedes
    //Mostrar huésped
    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll(); //Método que ya está definido en este Repositorio para obtener toda la información de esa Tabla.
    }

    //Crear huésped va a recibir sin Id
    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped); //Va a recibir una entidad, que en este caso será huésped
    }

    //Editar huésped va a recibir con Id
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped); //Va a recibir una entidad, que en este caso será huésped
    }

    //Eliminar huésped, que será un public void porque no va a retornar nada
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }
}
