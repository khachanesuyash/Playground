#include <iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];    
  char temp;  
  //Your code goes here
  cin.getline(str,100);
  int len = strlen(str) - 1;
  for(int i = 0;i < len; i++,len--){
    temp = str[i];
    str[i] = str[len];
    str[len] = temp;
  }
  std::cout<<str;
}