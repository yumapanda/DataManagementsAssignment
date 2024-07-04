#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
  int d1,d2,total = 0;
  char name[20];

  printf("What is your name?\n> ");
  scanf("%s",name);
  printf("Hello, %s!\n",name);

  srand(time(NULL));
  d1 = rand() % 6 + 1;
  d2 = rand() % 6 + 1;

  printf("Rolling the dice...\n");
  printf("Die 1: %d\n",d1);
  printf("Die 2: %d\n",d2);
  total = d1 + d2;
  printf("Total value: %d\n",total);

  /*if(total >= 7) printf("You won\n");
    else printf("You lost\n");*/
  
  if(d1 == d2) printf("Same dice number!! %s won!\n",name);
  else if(total >= 7) printf("%s won!\n",name);
  else printf("%s lost\n",name);
  

  return 0;
}