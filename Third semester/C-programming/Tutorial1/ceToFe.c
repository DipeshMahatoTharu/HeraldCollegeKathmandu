// °F = (°C × 9/5) + 32
//°C = (°F − 32) x 5/9


#include <stdio.h>
int main (){
char choice;
float temperture, converTemperture ;
printf("Enter 'C' for celius if you want to change celcius to ferhnieght and Enter 'F' for ferhnieght to celcius : ");
scanf("%c",&choice);

if (choice == 'c' || choice == 'C'){
    printf("Enter the celcius : ");
    scanf("%f",&temperture);
    converTemperture=(temperture * 9/5)+32;
    printf("Your Fer temp is : %.2f ",converTemperture );
}
else if (choice == 'f' || choice == 'F'){
    printf("Enter the Fre temp :");
    scanf("%f",&temperture);
    converTemperture=(temperture =32)*5/9;
    printf("Your ce is : %.2f",converTemperture);
    }else{
    printf("enter the valid number");
    }


}





