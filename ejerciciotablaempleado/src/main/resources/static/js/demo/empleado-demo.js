// Llamada a la librería DataTables para poblar la tabla con datos de nuestra API
$(document).ready(function() {
    $('#dataTableEmpleados').DataTable({
      "ajax": {
        "url": "/api/empleados", // Endpoint que definimos en el EmpleadoController
        "dataSrc": "" // Indicamos que los datos vienen directamente en el array raíz
      },
      "columns": [
        { "data": "id" },
        { "data": "nombre" },
        { "data": "oficina" },
        { "data": "edad" }
        // Podríamos agregar una columna para acciones (editar/eliminar) si quisiéramos
        // { 
        //   "data": null,
        //   "defaultContent": "<button class='btn btn-sm btn-primary'>Editar</button> <button class='btn btn-sm btn-danger'>Eliminar</button>"
        // }
      ],
      // Traducción al español de la tabla (opcional pero recomendado)
      "language": {
        "url": "//cdn.datatables.net/plug-ins/1.10.21/i18n/Spanish.json"
      }
    });
  });