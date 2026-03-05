package com.example.spring_mysql;

import com.example.spring_mysql.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marca esta clase como un servicio de Spring, lo que indica que es un componente de servicio donde reside la lógica de negocio.
public class ProfesoresService {

    @Autowired // Inyección de dependencias de Spring. Inyecta automáticamente una instancia del repositorio ProfesoresRepository.
    private ProfesoresRepository profesoresRepository;

    // Método para obtener todos los profesoress
    public List<Profesores> obtenerTodos() {
        // Llama al método findAll del repositorio para recuperar todos los profesoress de la base de datos
        return profesoresRepository.findAll();
    }

    // Método para obtener un profesores por su ID
    public Profesores obtenerPorId(Long id) {
        // Llama al método findById del repositorio para recuperar un profesores por su ID
        // Utiliza orElse(null) para devolver null si no se encuentra el profesores
        return profesoresRepository.findById(id).orElse(null);
    }

    // Método para guardar o actualizar un profesores
    public Profesores guardarProfesores(Profesores profesores) {
        // Llama al método save del repositorio para guardar el profesores en la base de datos
        return profesoresRepository.save(profesores);
    }

    // Método para eliminar un profesores por su ID
    public void eliminarProfesores(Long id) {
        // Llama al método deleteById del repositorio para eliminar el profesores por su ID
        profesoresRepository.deleteById(id);
    }
}
