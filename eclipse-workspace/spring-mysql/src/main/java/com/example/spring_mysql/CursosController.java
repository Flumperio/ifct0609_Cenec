package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")//permite llamar a la api de spring boot
@RestController // Anotación que indica que esta clase es un controlador de Spring que manejará solicitudes HTTP y devolverá datos JSON o XML.
@RequestMapping("/api/cursos") // Establece la ruta base para todos los endpoints definidos en esta clase.
public class CursosController {

    @Autowired // Inyección de dependencias automática del servicio CursosService.
    private CursosService cursosService;

    @GetMapping // Maneja solicitudes GET en la ruta "/api/cursoss".
    public List<Cursos> obtenerTodos() {
        // Llama al servicio para obtener todos los cursoss y los devuelve.
        return cursosService.obtenerTodos();
    }

    @GetMapping("/{id}") // Maneja solicitudes GET en la ruta "/api/cursoss/{id}".
    public Cursos obtenerPorId(@PathVariable Long id) {
        // Llama al servicio para obtener un cursos por su ID y lo devuelve.
        return cursosService.obtenerPorId(id);
    }

    @PostMapping // Maneja solicitudes POST en la ruta "/api/cursoss".
    public Cursos guardarCursos(@RequestBody Cursos cursos) {
        // Llama al servicio para guardar un nuevo cursos y lo devuelve.
        // @RequestBody indica que el cuerpo de la solicitud HTTP contiene los datos del cursos en formato JSON.
        return cursosService.guardarCursos(cursos);
    }

    @DeleteMapping("/{id}") // Maneja solicitudes DELETE en la ruta "/api/cursoss/{id}".
    public void eliminarCursos(@PathVariable Long id) {
        // Llama al servicio para eliminar un cursos por su ID.
        cursosService.eliminarCursos(id);
    }
}
