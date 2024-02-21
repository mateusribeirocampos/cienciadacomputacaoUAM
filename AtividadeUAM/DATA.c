#include <stdio.h>
#include <time.h>

void printCalendar(int month, int year)
{
    // Obtém o número de dias no mês
    struct tm t = {0};
    t.tm_year = year - 1900;
    t.tm_mon = month -1;
    mktime(&t);
    int daysInMonth = t.tm_mday;

    // Obtém o dia da semana para o primeiro dia do mês
    t.tm_mday = 1;
    mktime(&t);

    // Imprime o cabeçalho do calendário
    char * monthName;
    switch (month) {
        case 1: monthName = "Janeiro"; break;
        case 2: monthName = "Fevereiro"; break;
        case 3: monthName = "Marco"; break;
        // add the rest of the months
    }
    printf("%s %d", monthName, year);
    printf("\nDom Seg Ter Qua Qui Sex Sab\n");

    // Imprime os espaços em branco antes do primeiro dia do mês
    for (int i = 0; i < t.tm_wday; i++)
        printf("   ");

    // Imprime os dias do mês
    for (int i = 1; i <= daysInMonth; i++)
    {
        printf("%3d ", i);
        if ((i + t.tm_wday) % 7 == 0)
            printf("\n");
    }
    printf("\n");
}

int main()
{
    printCalendar(1, 2023);
    printCalendar(2, 2023);
    printCalendar(3, 2023);
    return 0;
}
