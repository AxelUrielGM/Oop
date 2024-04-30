#include <iostream>
#include <sstream>
#include <iomanip>
#include <map>
#include <string>

// Función para convertir un número entero a hexadecimal como A
std::string to_hex(int number) {
    std::stringstream ss;
    ss << std::hex << number; // Inserta el número como hexadecimal al stream
    return ss.str(); // Devuelve la cadena resultante
}

// Función para imprimir un dígito hexadecimal en arte ASCII
void print_hex_digit(char digit) {
    const std::map<char, std::string> hex_art = {
        {'0', "  *  \n * * \n*   *\n*   *\n * * \n  *  "},
        {'1', "  *  \n **  \n* *  \n  *  \n  *  \n*****"},
        {'2', " *** \n*   *\n   * \n  *  \n *   \n*****"},
        {'3', "**** \n    *\n  ** \n    *\n    *\n**** "},
        {'4', "*  * \n*  * \n*  * \n*****\n   * \n   * "},
        {'5', "*****\n*    \n**** \n    *\n    *\n**** "},
        {'6', " *** \n*    \n**** \n*   *\n*   *\n *** "},
        {'7', "*****\n    *\n   * \n  *  \n *   \n *   "},
        {'8', " *** \n*   *\n *** \n*   *\n*   *\n *** "},
        {'9', " *** \n*   *\n ****\n    *\n    *\n *** "},
        {'a', " *** \n*   *\n*****\n*   *\n*   *\n*****"},
        {'b', "**** \n*   *\n**** \n*   *\n*   *\n**** "},
        {'c', " *** \n*   *\n*    \n*    \n*   *\n *** "},
        {'d', "**** \n*   *\n*   *\n*   *\n*   *\n**** "},
        {'e', "*****\n*    \n**** \n*    \n*    \n*****"},
        {'f', "*****\n*    \n**** \n*    \n*    \n*    "}
    };

    // Imprime el arte ASCII correspondiente al dígito hexadecimal
    std::cout << hex_art.at(digit) << '\n';
}

int main() {
    int number;

    // Solicita al usuario un número decimal
    std::cout << "Ingrese un número decimal: ";
    std::cin >> number;

    // Convierte el número a hexadecimal
    std::string hex = to_hex(number);
    std::cout << "Equivalente hexadecimal: " << hex << std::endl;

    // Imprime cada dígito del número hexadecimal en forma gráfica
    std::cout << "\nRepresentación gráfica:\n";
    for (char digit : hex) {
        print_hex_digit(digit);
        std::cout << "\n";
    }

    return 0;
}
