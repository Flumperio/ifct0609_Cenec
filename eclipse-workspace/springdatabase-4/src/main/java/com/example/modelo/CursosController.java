package com.example.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursosRepository cursosRepository;

    @GetMapping
    public List<Cursos> getAll_Cursos() {
        return cursosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cursos> getCursosById(@PathVariable Integer id) {
        return cursosRepository.findById(id);
    }

    @PostMapping
    public Cursos createCursos(@RequestBody Cursos cursos) {
        return cursosRepository.save(cursos);
    }

    @PutMapping("/{id}")
    public Cursos updateCursos(@PathVariable Integer id, @RequestBody Cursos cursosDetails) {
        return cursosRepository.findById(id).map(cursos -> {
            cursos.setNombre_curso(cursosDetails.getNombre_curso());
            cursos.setDescripcion(cursosDetails.getDescripcion());
            cursos.setPrecio(cursosDetails.getPrecio());
            return cursosRepository.save(cursos);
        }).orElseThrow(() -> new RuntimeException("Curso no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deleteCursos(@PathVariable Integer id) {
        cursosRepository.deleteById(id);
    }
}
