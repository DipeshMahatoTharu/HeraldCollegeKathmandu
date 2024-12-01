/*. Write a void function which finds and prints the midpoint coordinates of a line. The
function should take in four parameters (x1, y1, x2 and y2).
 xmid=(x1+x2)/2, ymid=(y1+y2)/2*/

#include <stdio.h>
void midPoint(float x1,float x2,float y1,float y2){
float midpointx=(x1+x2)/2;
float midpointy=(y1+y2)/2;

printf("midpointx :%f",midpointx);
printf("midpointy :%f",midpointy);
}
int main(){
float x1,x2,y1,y2;
printf("Enter the x1,y1,x2,y2 : ");
scanf("%f""%f""%f""%f",&x1,&y1,&x2,&y2);

midPoint(x1,x2,y1,y2) ;




}
