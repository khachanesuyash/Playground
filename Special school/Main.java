#include<bits/stdc++.h>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string str, str2;
  cin >> str >> str2;
  reverse(str.begin(),str.end());
  if(str2 == str) cout << "It is correct";
  else cout << "It is wrong";
}