package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")//permite llamar a la api de spring boot
@RestController // Anotación que indica que esta clase es un controlador de Spring que manejará solicitudes HTTP y devolverá datos JSON o XML.
@RequestMapping("/api/alumnos") // Establece la ruta base para todos los endpoints definidos en esta clase.
public class AlumnosController {

    @Autowired // Inyección de dependencias automática del servicio AlumnosService.
    private AlumnosService alumnosService;

    @GetMapping // Maneja solicitudes GET en la ruta "/api/alumnoss".
    public List<Alumnos> obtenerTodos() {
        // Llama al servicio para obtener todos los alumnoss y los devuelve.
        return alumnosService.obtenerTodos();
    }

    @GetMapping("/{id}") // Maneja solicitudes GET en la ruta "/api/alumnoss/{id}".
    public Alumnos obtenerPorId(@PathVariable Long id) {
        // Llama al servicio para obtener un alumnos por su ID y lo devuelve.
        return alumnosService.obtenerPorId(id);
    }

    @PostMapping // Maneja solicitudes POST en la ruta "/api/alumnoss".
    public Alumnos guardarAlumnos(@RequestBody Alumnos alumnos) {
        // Llama al servicio para guardar un nuevo alumnos y lo devuelve.
        // @RequestBody indica que el cuerpo de la solicitud HTTP contiene los datos del alumnos en formato JSON.
        return alumnosService.guardarAlumnos(alumnos);
    }

    @DeleteMapping("/{id}") // Maneja solicitudes DELETE en la ruta "/api/alumnoss/{id}".
    public void eliminarAlumnos(@PathVariable Long id) {
        // Llama al servicio para eliminar un alumnos por su ID.
        alumnosService.eliminarAlumnos(id);
    }
}
