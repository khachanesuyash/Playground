#include<bits/stdc++.h>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string name;
  getline(cin, name);
  reverse(name.begin(), name.end());
  cout << name;
}