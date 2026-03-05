package com.example.spring_mysql;

import com.example.spring_mysql.AlumnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marca esta clase como un servicio de Spring, lo que indica que es un componente de servicio donde reside la lógica de negocio.
public class AlumnosService {

    @Autowired // Inyección de dependencias de Spring. Inyecta automáticamente una instancia del repositorio AlumnosRepository.
    private AlumnosRepository alumnosRepository;

    // Método para obtener todos los alumnoss
    public List<Alumnos> obtenerTodos() {
        // Llama al método findAll del repositorio para recuperar todos los alumnoss de la base de datos
        return alumnosRepository.findAll();
    }

    // Método para obtener un alumnos por su ID
    public Alumnos obtenerPorId(Long id) {
        // Llama al método findById del repositorio para recuperar un alumnos por su ID
        // Utiliza orElse(null) para devolver null si no se encuentra el alumnos
        return alumnosRepository.findById(id).orElse(null);
    }

    // Método para guardar o actualizar un alumnos
    public Alumnos guardarAlumnos(Alumnos alumnos) {
        // Llama al método save del repositorio para guardar el alumnos en la base de datos
        return alumnosRepository.save(alumnos);
    }

    // Método para eliminar un alumnos por su ID
    public void eliminarAlumnos(Long id) {
        // Llama al método deleteById del repositorio para eliminar el alumnos por su ID
        alumnosRepository.deleteById(id);
    }
}
