#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "curl/curl.h"

// Function to search for a given keyword on a website

int searchKeyword(char *keyword)
{
    CURL *curl;
    CURLcode res;
    char url[100];
    sprintf(url, "https://www.google.com/search?q=%s", keyword);

    curl = curl_easy_init();
    if (curl)
    {
        curl_easy_setopt(curl, CURLOPT_URL, url);
        res = curl_easy_perform(curl);
        if (res != CURLE_OK)
            fprintf(stderr, "curl_easy_perform() failed: %s\n",
                    curl_easy_strerror(res));
        curl_easy_cleanup(curl);
    }
    return 0;
}

// Main function
int main(int argc, char *argv[])
{
    if (argc < 2)
    {
        printf("Usage: %s keyword\n", argv[0]);
        return 1;
    }

    char *keyword = argv[1];
    searchKeyword(keyword);

    return 0;
}
