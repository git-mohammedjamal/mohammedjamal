#include<stdio.h>
#include<conio.h>

int totalThousand=1000;
int totalFiveHundred=1000;
int totalOneHundred=1000;

void main()
{
    unsigned long withdrawAmount;
    unsigned long totalMoney;
    int thousand=0,fiveHundred=0,oneHundred=0;


    printf("Enter the amount in multiple of 100: ");
    scanf("%lu",&withdrawAmount);

    if(withdrawAmount%100 !=0){
        printf("Invalid amount;");
        getch();
        return;
    }

    totalMoney=totalThousand*1000+totalFiveHundred*500+totalOneHundred*100;

    if(withdrawAmount>totalMoney){
        printf("Sorry,Insufficient money");
        getch();
        return;
    }

    thousand=withdrawAmount/1000;
    if(thousand>totalThousand)
        thousand=totalThousand;
    withdrawAmount=withdrawAmount-thousand*1000;

    if(withdrawAmount>0){
        fiveHundred=withdrawAmount/500;
        if(fiveHundred>totalFiveHundred)
            fiveHundred=totalFiveHundred;
        withdrawAmount=withdrawAmount-fiveHundred*500;
    }

    if(withdrawAmount>0)
        oneHundred=withdrawAmount/100;

    printf("Total 1000 note: %d\n",thousand);
    printf("Total  500 note: %d\n",fiveHundred);
    printf("Total  100 note: %d\n",oneHundred);

    getch();
}
