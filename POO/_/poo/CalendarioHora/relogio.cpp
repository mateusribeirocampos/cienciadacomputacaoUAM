#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

// Definição da classe Relogio
class Relogio {
protected:
    int hora;
    int min;
    int segundo;
public:
    // Construtor da classe, inicializa os atributos com os valores passados
    Relogio(int hora, int min, int segundo) : hora(hora), min(min), segundo(segundo) {}

    // Métodos da classe
    void alterar_hora(int hora, int min, int segundo);
    void mostar_hora();

    // Métodos get e set para os atributos da classe
    int getHora() {
        return hora;
    }
    void setHora() {
        hora = 0;
    }

    int getMin() {
        return min;
    }

    void setMin() {
        min = 0;
    }

    int getSegundo() {
        return segundo;
    }

    void setSegundo() {
        segundo = 0;
    }

};

// Definição da classe Calendario
class Calendario {
protected:
    int mes;
    int dia;
    int ano;
public:
    // Construtor da classe, inicializa os atributos com os valores passados
    Calendario(int mes, int dia, int ano) : mes(mes), dia(dia), ano(ano) {}
    // Métodos da classe
    void alterar_data(int mes, int dia, int ano);
    void mostar_data(int& mes, int& dia, int& ano);

    // Métodos get e set para os atributos da classe
    int getMes() {
        return mes;
    }

    void setMes() {
        mes = 0;
    }

    int getDia() {
        return dia;
    }

    void setDia() {
        dia = 0;
    }

    int getAno() {
        return ano;
    }

    void setAno() {
        ano = 0;
    }
};

// Definição da classe Relogio_Calendario que herda as classes Relogio e Calendario
class Relogio_Calendario : public Relogio, public Calendario {
public:
    // Construtor da classe, chama os construtores das classes herdadas
    Relogio_Calendario(int mes, int dia, int ano, int hora, int min, int segundo) : Relogio(hora, min, segundo), Calendario(mes, dia, ano) {}

    // Método que imprime a data e hora
    void motrar_data_hora();
};

void Relogio_Calendario::motrar_data_hora() {
    cout << "Data: " << dia << "/" << mes << "/" << ano << endl;
    cout << "Hora: " << hora << ":" << min << ":" << segundo << endl;
}

// Função principal
int main() {
    // Cria um objeto da classe Relogio_Calendario passando valores para seus atributos
    Relogio_Calendario relogio(3, 19, 2023, 12, 34, 55);
    // Chama o método que imprime a data e hora
    relogio.motrar_data_hora();

    return 0;
}