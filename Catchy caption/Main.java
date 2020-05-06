#include <bits/stdc++.h>
using namespace std;

int main()
{
   //Your code goes here
  string str;
  int count = 0;
  getline(cin,str);
  for (int i = 0; str[i] != '\0';i++)
    {
        if (str[i] == ' ')
            count++;    
    }
  if(count <= 10)
    cout << "Caption eligible for the contest";
  else
    cout << "Caption not eligible for the contest";
}