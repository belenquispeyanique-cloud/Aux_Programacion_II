class Empresa:

    def __init__(self, nombre):
        self.nombre = nombre
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def mostrar_empleados(self):

        print("\n===================================")
        print("EMPRESA:", self.nombre)
        print("===================================")

        # Acceso mediante índices
        for i in range(len(self.empleados)):
            self.empleados[i].mostrar()