#include <iostream>
#include <ctime>

using namespace std;

int main() {
    // Obter o tempo atual em segundos desde 1 de janeiro de 1970
    time_t tempo_atual = time(0);

    // Converter o tempo atual em uma estrutura tm
    tm* tempo_local = localtime(&tempo_atual);

    // Exibir a data e hora atual
    cout << "Data atual: ";
    cout << tempo_local->tm_mday << "/";
    cout << (tempo_local->tm_mon + 1) << "/";   
    cout << (tempo_local->tm_year + 1900) << " ";
    cout << "\nHora atual: ";
    cout << tempo_local->tm_hour << ":";
    cout << tempo_local->tm_min << ":";
    cout << tempo_local->tm_sec << endl;

    return 0;
}
