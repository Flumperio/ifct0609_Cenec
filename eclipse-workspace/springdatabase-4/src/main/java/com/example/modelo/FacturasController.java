package com.example.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facturas")
public class FacturasController {

    @Autowired
    private FacturasRepository facturasRepository;

    @GetMapping
    public List<Facturas> getAll_Facturas() {
        return facturasRepository.findAll();
    }

    @GetMapping("/{id_factura}")
    public Optional<Facturas> getFacturasById(@PathVariable Integer id_factura) {
        return facturasRepository.findById(id_factura);
    }

    @PostMapping
    public Facturas createFacturas(@RequestBody Facturas facturas) {
        return facturasRepository.save(facturas);
    }

    @PutMapping("/{id}")
    public Facturas updateFacturas(@PathVariable Integer id, @RequestBody Facturas facturasDetails) {
        return facturasRepository.findById(id).map(facturas -> {
            facturas.setId_alumno(facturasDetails.getId_alumno());
            facturas.setImporte(facturasDetails.getImporte());
            facturas.setPagado(facturasDetails.getPagado());
            return facturasRepository.save(facturas);
        }).orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deleteFacturas(@PathVariable Integer id) {
        facturasRepository.deleteById(id);
    }
}
