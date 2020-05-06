#include<bits/stdc++.h>
using namespace std;
int main()
{
  // Type your code here
  int T,key;
  bool flag = false;
  cin >> T;
  int arr[T];
  for(int i = 0;i < T; i++)
    cin >> arr[i];
  cin >> key;
  for(int i = 0;i < T; i++){
    if(key == arr[i]){
      flag = true;
      break;
    }
  }
  
  if(flag == true)
    cout << "She passed her exam";
  else
    cout << "She failed";
}