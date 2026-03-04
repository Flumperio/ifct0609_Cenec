package com.example.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaController {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @GetMapping
    public List<Asistencia> getAll_Asistencia() {
        return asistenciaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Asistencia> getAsistenciaById(@PathVariable Integer id) {
        return asistenciaRepository.findById(id);
    }

    @PostMapping
    public Asistencia createAsistencia(@RequestBody Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @PutMapping("/{id}")
    public Asistencia updateAsistencia(@PathVariable Integer id, @RequestBody Asistencia asistenciaDetails) {
        return asistenciaRepository.findById(id).map(asistencia -> {
            asistencia.setId_alumno(asistenciaDetails.getId_alumno());
            asistencia.setId_curso(asistenciaDetails.getId_curso());
            asistencia.setFecha_asistencia(asistenciaDetails.getFecha_asistencia());
            return asistenciaRepository.save(asistencia);
        }).orElseThrow(() -> new RuntimeException("Asistencia no definida."));
    }

    @DeleteMapping("/{id}")
    public void deleteAsistencia(@PathVariable Integer id) {
        asistenciaRepository.deleteById(id);
    }
}
