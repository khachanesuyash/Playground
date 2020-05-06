#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int T,esum = 0, osum = 0;
  cin >> T;
  int arr[T];
  for(int i = 0;i < T; i++)
    cin >> arr[i];
  for(int i = 0;i < T; i++){
    if(arr[i] % 2 == 0)
      esum += arr[i];
    else
      osum += arr[i];
  }
  
  cout << "The sum of the even numbers in the array is " << esum << endl;
  cout << "The sum of the odd numbers in the array is " << osum;
}