package com.api.hotel.controller;

import com.api.hotel.model.Huesped;
import com.api.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {

    //Aquí vamos a hacer una inyección de nuestro HuespedService
    @Autowired
    private HuespedService huespedService;

    //Aquí vamos a crear los mismos métodos anteriormente, solo que en este caso ya enfocado al Controlador

    //MÉTODO GET
    @GetMapping
    public List<Huesped> listarTodo(){ //Para que me enliste a todos los huéspedes
        return huespedService.getAllHuespedes();
    }

    //MÉTODO POST
    @PostMapping
    public Huesped crear(@RequestBody Huesped huesped) { //Va a recibir una petición de @RequestBody y será un objeto de huésped
        return huespedService.createHuesped(huesped);
    }

    //MÉTODO PUT
    @PostMapping("editar/{id}") //Aquí vamos a definir una ruta para editar que va a recibir una id que posteriormente vamos a manejar en el método actualizar
    public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Long id){
        huesped.setIdHuesped(id); //Aquí seteamos el id de nuestro huésped
        return huespedService.updateHuesped(huesped);
    }

    //MÉTODO DELETE
    @DeleteMapping("eliminar/{id}") //Aquí vamos a definir una ruta para eliminar que va a recibir una id que posteriormente vamos a manejar en el método eliminar
    //public void no retorna ningún valor
    public void eliminar(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }
}
