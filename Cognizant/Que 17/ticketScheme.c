#include<stdio.h>
#include <stdlib.h>
int main()
{
int noTicket;
double total = 0,cost;
char ref[2], co[2] , circle[2];

printf("Enter the no of ticket:");
scanf("%d",&noTicket);

if (noTicket < 5 || noTicket > 40) {
    printf("Minimum of 5 and Maximum of 40 tickets");
    exit(0);
}

printf("Do you want refreshment:");
scanf("%s",&ref);
printf("Do you have coupon code:");
scanf("%s",&co);
printf("Enter the circle:");
scanf("%s",&circle);

if(circle[0] ==  'K')
    cost=75*noTicket;

else if(circle[0]== 'Q')
    cost=150*noTicket;

else
{
    printf("Invalid Input");
    exit(0);
}
total=cost;

if(noTicket>20)
    cost= cost - ((0.1)*cost);
total=cost;

if(co[0]== 'y')
    total= cost - ((0.02)*cost);
    
    if(ref[0]== 'y')
        total += (noTicket*50);
    printf("Ticket cost:%.2f",total);
    return 0;
}
