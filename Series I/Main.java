#include<iostream>
using namespace std;

int main(){
  int num;
  float mul = 0.5;
  cin >> num;
  int i = 1;
  while(num > 0){
    //mul = 0.5*i;
    cout << mul << " ";
    mul *= 3;
    num--;
  }
}