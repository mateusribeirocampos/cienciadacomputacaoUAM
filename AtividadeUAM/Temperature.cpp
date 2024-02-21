#include <iostream>
#include <Windows.h>

int main()
{
    while (true)
    {
        // Run the wmic command to get the processor temperature
        system("wmic /namespace:\\\\root\\wmi PATH MSAcpi_ThermalZoneTemperature get CurrentTemperature");
        // Wait for 5 seconds
        Sleep(5000);
    }
    return 0;
}
