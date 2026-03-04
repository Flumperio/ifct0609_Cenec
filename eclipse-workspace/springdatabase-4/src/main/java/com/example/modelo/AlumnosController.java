package com.example.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnosRepository alumnosRepository;

    @GetMapping
    public List<Alumnos> getAll_Alumnos() {
        return alumnosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Alumnos> getAlumnosById(@PathVariable Integer id) {
        return alumnosRepository.findById(id);
    }

    @PostMapping
    public Alumnos createAlumnos(@RequestBody Alumnos alumnos) {
        return alumnosRepository.save(alumnos);
    }

    @PutMapping("/{id}")
    public Alumnos updateAlumnos(@PathVariable Integer id, @RequestBody Alumnos alumnosDetails) {
        return alumnosRepository.findById(id).map(alumnos -> {
            alumnos.setNombre(alumnosDetails.getNombre());
            alumnos.setApellidos(alumnosDetails.getApellidos());
            alumnos.setCiudad(alumnosDetails.getCiudad());
            alumnos.setDireccion(alumnosDetails.getDireccion());
            return alumnosRepository.save(alumnos);
        }).orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deleteAlumnos(@PathVariable Integer id) {
        alumnosRepository.deleteById(id);
    }
}
