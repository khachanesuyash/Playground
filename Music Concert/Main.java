#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int T,ecount = 0,ocount = 0;
  cin >> T;
  int arr[T];
  for(int i = 0;i<T;i++)
    cin >> arr[i];
  
  for(int i = 0;i<T;i++){
    if(arr[i]%2 == 0)
      ecount++;
    else
      ocount++;
  }
  cout << ocount << endl;
  cout << ecount << endl;
  return 0;
}