from Empleado import Empleado
from Empresa import Empresa
from Excepciones import (
    SueldoInvalidoException,
    CargoInvalidoException
)

empresa_nombre = input("Ingrese el nombre de la empresa: ")

empresa = Empresa(empresa_nombre)

cantidad = int(
    input("¿Cuántos empleados desea registrar?: ")
)

for i in range(cantidad):

    print("\nEmpleado", i + 1)

    nombre = input("Nombre: ")

    # Validación del cargo
    while True:

        try:

            cargo = input("Cargo: ")

            for caracter in cargo:

                if caracter.isdigit():
                    raise CargoInvalidoException(
                        "El cargo no puede contener números."
                    )

            break

        except CargoInvalidoException as error:

            print("Error:", error)
            print("Ingrese nuevamente el cargo.")

    # Validación del sueldo
    sueldo = float(
        input("Sueldo: ")
    )

    try:

        if sueldo < 2500:

            raise SueldoInvalidoException(
                "El sueldo ingresado es menor al "
                "Salario Mínimo Nacional."
            )

    except SueldoInvalidoException as error:

        print("Error:", error)
        print(
            "Se asignará automáticamente "
            "el sueldo mínimo de Bs 2500."
        )

        sueldo = 2500

    empleado = Empleado(
        nombre,
        cargo,
        sueldo
    )

    empresa.agregar_empleado(
        empleado
    )

empresa.mostrar_empleados()