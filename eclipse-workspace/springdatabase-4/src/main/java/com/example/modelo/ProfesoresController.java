package com.example.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {

    @Autowired
    private ProfesoresRepository profesoresRepository;

    @GetMapping
    public List<Profesores> getAll_Profesores() {
        return profesoresRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Profesores> getProfesoresById(@PathVariable Integer id) {
        return profesoresRepository.findById(id);
    }

    @PostMapping
    public Profesores createProfesores(@RequestBody Profesores profesores) {
        return profesoresRepository.save(profesores);
    }

    @PutMapping("/{id}")
    public Profesores updateProfesores(@PathVariable Integer id, @RequestBody Profesores profesoresDetails) {
        return profesoresRepository.findById(id).map(profesores -> {
            profesores.setNombre(profesoresDetails.getNombre());
            profesores.setApellidos(profesoresDetails.getApellidos());
            profesores.setDomicilio(profesoresDetails.getDomicilio());
            profesores.setCiudad(profesoresDetails.getCiudad());
            profesores.setProvincia(profesoresDetails.getProvincia());
            profesores.setCp(profesoresDetails.getCp());
            profesores.setEmail(profesoresDetails.getEmail());
            return profesoresRepository.save(profesores);
        }).orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deleteProfesores(@PathVariable Integer id) {
        profesoresRepository.deleteById(id);
    }
}
