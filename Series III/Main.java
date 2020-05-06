#include<iostream>
using namespace std;

int main(){
  int num;
  cin >> num;
  int val = 6;
  int i = 1;
  while(num--){
    
    cout << val << " ";
    val += 5*i;
    i++;
  }
}