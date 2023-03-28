#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

class Calendario{
    protected:
        int mes;
        int dia;
        int ano;
    public:
        Calendario(int mes, int dia, int ano);
        void alterar_data(int mes, int dia, int ano);
        void mostar_data(int &mes, int &dia, int &ano);
};