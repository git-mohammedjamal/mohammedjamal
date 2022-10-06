#include<stdio.h>
#include<math.h>
int main()
{
    int low,high,number,originalNum,rem,count=0;
    double result=0.0;
    printf("Enter two numbers(intervals): ");
    scanf("%d %d",&low,&high);
    printf("Armstrong numbers between %d and %d are: ",low,high);

    if(high<low){
        high+=low;
        low=high-low;
        high-=low;
    }

    for(number=low+1;number<high;++number){
        originalNum=number;

        while(originalNum!=0){
            originalNum/=10;
            ++count;
        }

        originalNum=number;

        while(originalNum!=0){
            rem=originalNum%10;
            result+=pow(rem,count);
            originalNum/=10;
        }

        if((int)result==number){
            printf("%d",number);
        }

        count=0;
        result=0;
    }

    return 0;
}
