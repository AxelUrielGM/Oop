#include <iostream>
#include <string>
#include <map>

int main() {
    // Diccionario de códigos binarios y su representación gráfica
    std::map<std::string, std::string> binToHex = {
    {"0000",
    " ---- \n"
    "|    |\n"
    "      \n"
    "|    |\n"
    " ---- \n"}, // Imagen de 0
    {"0001",
    "      \n"
    "     |\n"
    "     |\n"
    "     |\n"
    "      \n"}, // Imagen de 1
    {"0010",
    "  ---- \n"
    "      |\n"
    "  ---- \n"
    " |     \n"
    "  ---- \n"}, // Imagen de 2
    {"0011",
    " ---- \n"
    "     |\n"
    " ---- \n"
    "     |\n"
    " ---- \n"}, // Imagen de 3
    {"0100",
    "      \n"
    "|    |\n"
    " ---- \n"
    "     |\n"
    "      \n"}, // Imagen de 4
    {"0101",
    " ---- \n"
    "|     \n"
    " ---- \n"
    "     |\n"
    " ---- \n"}, // Imagen de 5
    {"0110",
    "      \n"
    "|     \n"
    " ---- \n"
    "|    |\n"
    " ---- \n"}, // Imagen de 6
    {"0111",
    " ---- \n"
    "     |\n"
    "      \n"
    "     |\n"
    "      \n"}, // Imagen de 7
    {"1000",
    " ---- \n"
    "|    |\n"
    " ---- \n"
    "|    |\n"
    " ---- \n"}, // Imagen de 8
    {"1001",
    " ---- \n"
    "|    |\n"
    " ---- \n"
    "     |\n"
    "      \n"}, // Imagen de 9
    {"1010",
    " ---- \n"
    "|    |\n"
    " ---- \n"
    "|    |\n"
    "      \n"}, // Imagen de A
    {"1011",
    "      \n"
    "|     \n"
    " ---- \n"
    "|    |\n"
    " ---- \n"}, // Imagen de B
    {"1100",
    " ---- \n"
    "|     \n"
    "      \n"
    "|     \n"
    " ---- \n"}, // Imagen de C
    {"1101",
    "      \n"
    "     |\n"
    " ---- \n"
    "|    |\n"
    " ---- \n"}, // Imagen de D
    {"1110",
    " ---- \n"
    "|     \n"
    " ---- \n"
    "|     \n"
    " ---- \n"}, // Imagen de E
    {"1111",
    " ---- \n"
    "|     \n"
    " ---- \n"
    "|     \n"
    "      \n"}, // Imagen de F
    };

        std::string binaryInput;

    // Solicitar al usuario el número binario de 4 dígitos
    std::cout << "Ingrese un numero binario de 4 digitos: ";
    std::cin >> binaryInput;

    // Validar la entrada del usuario
    if (binaryInput.length() != 4 || binaryInput.find_first_not_of("01") != std::string::npos) {
        std::cout << "Entrada invalida. Asegurese de ingresar un numero binario de 4 digitos." << std::endl;
        return 1; // Termina el programa con un código de error
    }

    // Buscar el valor binario en el mapa y imprimir el hexadecimal correspondiente
    auto it = binToHex.find(binaryInput);
    if (it != binToHex.end()) {
        std::cout << "El valor en hexadecimal es:\n" << it->second << std::endl;
    }
    else {
        // En teoría, este caso no debería ocurrir debido a la validación de la entrada,
        // pero se incluye por completitud.
        std::cout << "No se encontró una coincidencia. Esto no debería ocurrir." << std::endl;
    }

    return 0;

}
