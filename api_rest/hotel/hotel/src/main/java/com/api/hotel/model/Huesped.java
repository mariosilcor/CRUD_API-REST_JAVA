package com.api.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity //Entity le dice a la persistencia de Java que esta Clase va a ser una Entidad
@Data //Data va a definir nuestra Clase como un flujo de información que nos va a ayudar a crear nuestros campos de una manera más sencilla.
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Aquí vamos a definir las variables en Privado
    private Long idHuesped;

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;

    @OneToMany(cascade = CascadeType.ALL) //Tabla One to Many.
    //Array que va a almacenar toda la información de todas las reservas.
    private List<Reserva> reservas = new ArrayList<>();
}
