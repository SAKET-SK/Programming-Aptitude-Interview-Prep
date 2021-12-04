#include<stdio.h>

#include <stdlib.h>

int main()
{
    printf("Enter the month:");
    int entry ;
    scanf("%d",&entry);

    switch (entry)
    {
                    case 12:
                    case 1:
                    case 2:
                          printf("Season: Winter");
                    break;

                    case 3:
                    case 4:
                    case 5:
                    printf("Season: Spring");
                    break;

                    case 6:
                    case 7:
                    case 8:
                    printf("Season: Summer");
                    break;

                    case 9:
                    case 10:
                    case 11:
                    printf("Season: Autumn");
                    break;

                    default:
                    printf("Invalid month");
               }
    return 0;
}
