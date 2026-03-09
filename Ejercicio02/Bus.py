class Bus():
    def __init__(self, x : int):
        self.__asientos = x
        self.__pasajeros = 0
        self.__cobro = 1.5
        
    def subePasajero(self, personas):
        if self.__pasajeros + personas <= self.__asientos:
            self.__pasajeros += personas
            print(f"Subieron {personas} pasajeros")
        else:
            print("No hay asientos disponibles")
            
    def cobroPasaje(self):
        total = self.__pasajeros * self.__cobro
        print(f"Total a cobrar: {total}")
        
    def AsientosVacios(self):
        lleno = self.__asientos - self.__pasajeros
        print(f"Hay {lleno} asientos vacios")
        
    def __str__(self):
        return f"Se registro el bus con {self.__asientos} asientos"
        
class Main:
    busA = Bus(35)
    print(busA.__str__())
    busA.subePasajero(17)
    busA.cobroPasaje()
    busA.AsientosVacios()