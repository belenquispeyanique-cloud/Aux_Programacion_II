class ServidorMinecraft():
    def __init__(self):
        self.__rango = 10
        self.__jugadores = {}
        
    def entraJugador(self, nombre, diamantes):
        if len(self.__jugadores) < self.__rango:
            self.__jugadores[nombre] = diamantes
            print(f"{nombre} entro con {diamantes} diamantes")
        else:
            print("El servidor esta lleno")
            
    def Stacks(self):
        for nombre, diamantes in self.__jugadores.items():
            stacks = diamantes // 64
            print(f"{nombre} tiene {stacks} stack's de diamantes")
        
    def contar(self):
        if self.__jugadores:
            jugador = max(self.__jugadores, key = self.__jugadores.get)
            print(f"Jugador con mas diamantes: {jugador} con {self.__jugadores[jugador]} diamantes")
        
    def TotalDiamantes(self):
        total = sum(self.__jugadores.values())
        print(f"Total de diamantes en el servidor: {total}")
        
    def __str__(self):
        return f"Servidor con cantidad: {len(self.__jugadores)} de {self.__rango} "
    
class Main:
    server = ServidorMinecraft()
    print(server.__str__())
    server.entraJugador("Belen", 25)
    server.entraJugador("Alex", 325)
    server.Stacks()
    server.contar()
    server.TotalDiamantes()