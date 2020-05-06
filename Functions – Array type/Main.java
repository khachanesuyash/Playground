#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int T;
  cout << "Enter the number of elements in the array";
  cin >> T;
  int arr[T];
  cout << "\nEnter the elements in the array";
  for(int i = 0;i < T; i++)
    cin >> arr[i];
  int ecount = 0, ocount = 0;
  for(int i = 0;i < T; i++){
    if(arr[i]%2 == 0)
      ecount++;
    else
      ocount++;
  }
  if(ecount == T)
    cout << "\nThe array is Even";
  else if(ocount == T)
    cout << "\nThe array is Odd";
  else
    cout << "\nThe array is Mixed";
}