#include<math.h>
#include<stdio.h>
int main()
{
    double base,ex,result;
    printf("Enter a base number: ");
    scanf("%lf",&base);
    printf("Enter an Exponent: ");
    scanf("%lf",&exp);

    result= pow(base, exp);

    printf("%.1lf^%.1lf=%.2lf",base,exp,result);
    return 0;
}
