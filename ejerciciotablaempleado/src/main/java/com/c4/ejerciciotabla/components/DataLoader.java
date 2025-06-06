package com.c4.ejerciciotabla.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.c4.ejerciciotabla.model.Empleado;
import com.c4.ejerciciotabla.repository.EmpleadoRepository;

@Component
public class DataLoader implements CommandLineRunner {

    // Inyecta el repositorio para poder guardar los datos
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public void run(String... args) throws Exception {
        // Este método se ejecutará automáticamente al iniciar la aplicación
        cargarDatosDeEmpleados();
    }

    private void cargarDatosDeEmpleados() {
        // Comprueba si la base de datos ya tiene datos para no duplicarlos
        if (empleadoRepository.count() == 0) {
            empleadoRepository.save(new Empleado("Juan Pérez", "Contabilidad", 35));
            empleadoRepository.save(new Empleado("Ana Gómez", "Recursos Humanos", 28));
            empleadoRepository.save(new Empleado("Carlos Ruiz", "Sistemas", 42));
            empleadoRepository.save(new Empleado("María López", "Marketing", 31));
            empleadoRepository.save(new Empleado("Pedro Martínez", "Sistemas", 29));
            
            System.out.println("Carga de datos inicial completada.");
        } else {
            System.out.println("La base de datos ya contiene datos. No se realizó la carga inicial.");
        }
    }
}
