#include<iostream>
using namespace std;

int main(){
  int num;
  cin >> num;
  int val = 11;
  while(num--){
    cout << val*val << " ";
    val += 4;
  }


}