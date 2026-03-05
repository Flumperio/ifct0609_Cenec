package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marca esta clase como un servicio de Spring, lo que indica que es un componente de servicio donde reside la lógica de negocio.
public class CursosService {

    @Autowired // Inyección de dependencias de Spring. Inyecta automáticamente una instancia del repositorio CursosRepository.
    private CursosRepository cursosRepository;

    // Método para obtener todos los cursoss
    public List<Cursos> obtenerTodos() {
        // Llama al método findAll del repositorio para recuperar todos los cursoss de la base de datos
        return cursosRepository.findAll();
    }

    // Método para obtener un cursos por su ID
    public Cursos obtenerPorId(Long id) {
        // Llama al método findById del repositorio para recuperar un cursos por su ID
        // Utiliza orElse(null) para devolver null si no se encuentra el cursos
        return cursosRepository.findById(id).orElse(null);
    }

    // Método para guardar o actualizar un cursos
    public Cursos guardarCursos(Cursos cursos) {
        // Llama al método save del repositorio para guardar el cursos en la base de datos
        return cursosRepository.save(cursos);
    }

    // Método para eliminar un cursos por su ID
    public void eliminarCursos(Long id) {
        // Llama al método deleteById del repositorio para eliminar el cursos por su ID
        cursosRepository.deleteById(id);
    }
}
