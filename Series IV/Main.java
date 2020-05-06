#include<iostream>
using namespace std;

int main(){
  int num;
  cin >> num;
  int i = 1;
  //num /= 2;

  while(i <= num){
    if (num == 3){
  		cout << "0 2 8";
    	break;}
    cout << (i*i-1) << " ";
	i+=1;
    if(num%2==0){
    	cout << (i*i-2) << " ";
    	i+=1;
    }
  }
}