class Avion(var tipo: String, nombreMedioT: String, placa: String): MedioTransporte(nombreMedioT, placa) {
    init {
        tipo = tipo.toUpperCase()
    }
}