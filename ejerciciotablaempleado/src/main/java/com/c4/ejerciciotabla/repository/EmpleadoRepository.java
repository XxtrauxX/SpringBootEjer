
package com.c4.ejerciciotabla.repository;

import com.c4.ejerciciotabla.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // JpaRepository ya nos da métodos como:
    // - save(Empleado empleado) -> Guardar o actualizar
    // - findById(Long id) -> Buscar por ID
    // - findAll() -> Obtener todos
    // - deleteById(Long id) -> Eliminar por ID
    // Puedes agregar consultas personalizadas aquí si las necesitas
}