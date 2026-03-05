package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")//permite llamar a la api de spring boot
@RestController // Anotación que indica que esta clase es un controlador de Spring que manejará solicitudes HTTP y devolverá datos JSON o XML.
@RequestMapping("/api/profesores") // Establece la ruta base para todos los endpoints definidos en esta clase.
public class ProfesoresController {

    @Autowired // Inyección de dependencias automática del servicio ProfesoresService.
    private ProfesoresService profesoresService;

    @GetMapping // Maneja solicitudes GET en la ruta "/api/profesoress".
    public List<Profesores> obtenerTodos() {
        // Llama al servicio para obtener todos los profesoress y los devuelve.
        return profesoresService.obtenerTodos();
    }

    @GetMapping("/{id}") // Maneja solicitudes GET en la ruta "/api/profesoress/{id}".
    public Profesores obtenerPorId(@PathVariable Long id) {
        // Llama al servicio para obtener un profesores por su ID y lo devuelve.
        return profesoresService.obtenerPorId(id);
    }

    @PostMapping // Maneja solicitudes POST en la ruta "/api/profesoress".
    public Profesores guardarProfesores(@RequestBody Profesores profesores) {
        // Llama al servicio para guardar un nuevo profesores y lo devuelve.
        // @RequestBody indica que el cuerpo de la solicitud HTTP contiene los datos del profesores en formato JSON.
        return profesoresService.guardarProfesores(profesores);
    }

    @DeleteMapping("/{id}") // Maneja solicitudes DELETE en la ruta "/api/profesoress/{id}".
    public void eliminarProfesores(@PathVariable Long id) {
        // Llama al servicio para eliminar un profesores por su ID.
        profesoresService.eliminarProfesores(id);
    }
}
