#include<stdio.h>
int main()
{
    int i;
    double num,sum=0.0;

    for(i=1;i<=10;++i){
        printf("Enter a n%d: ",i);
        scanf("%lf",&num);

        if(num<0.0){
            continue;
        }
        sum+=num;
    }
    printf("Sum=%.2lf",sum);

    return 0;
}
