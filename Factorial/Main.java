#include<iostream>
using namespace std;
int fact(int n){
  if (n == 0)
    return 1;
  else
    return n*fact(n-1);
  
}
int main()
{
  //Type your code here.
  int num;
  cin >> num;
  int ans = fact(num);
  cout << "The factorial of " << num <<" is " << ans;
}