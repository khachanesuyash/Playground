#include<iostream>
using namespace std;

int main(){
  int a,b,c,ans;
  cin >> a >> b >> c >> ans;
  int d = 1,i = 1;
  while(i<=a && i<=b && i<=c){
	if(a%i==0 && b%i==0 && c%i==0)
	d=i;
	i++;
}
  if (d==ans)
    cout << "Answer is correct.";
  else
    cout << "Answer is wrong.";  
}