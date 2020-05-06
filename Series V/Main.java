#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  cin >> num;
  int i = 11;
  while(num--){
    cout << i*i << " ";
  	i += 4;
  }
}