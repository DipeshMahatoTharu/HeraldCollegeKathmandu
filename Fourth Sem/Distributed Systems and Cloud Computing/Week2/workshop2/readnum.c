#include <stdio.h>
#include <stdlib.h>

void main()
{
  FILE *fp = NULL;
  float val = 0.0;
  float *nums;
  int count=0;
  char c;

  // Count the how many numbers there are
  fp = fopen("NumbersForMPI.txt", "r");
  while(!feof(fp)){
    if(fscanf(fp,"%f%c",&val,&c)>0){
      count++;
    }
  }
  fclose(fp);
  printf("\nCount = %d\n",count);
  
  // Allocate the necessary memory
  nums = malloc(count * sizeof(float));
  // Read the numbers into memory
  fp = fopen("NumbersForMPI.txt", "r");
  for(int i=0; i<count; i++){
    fscanf(fp,"%f%c",&(nums[i]),&c);
  }
  fclose(fp);

  // Print out the numbers in the memory
  for(int i=0; i<count; i++){
    printf("%f\t",nums[i]);
  }
  printf("\n");
  free(nums);
}
