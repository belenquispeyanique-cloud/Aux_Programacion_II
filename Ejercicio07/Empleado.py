class Empleado:

    def __init__(self, nombre, cargo, sueldo):
        self.nombre = nombre
        self.cargo = cargo
        self.sueldo = sueldo

    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Cargo:", self.cargo)
        print("Sueldo: Bs", self.sueldo)
        print("----------------------------")