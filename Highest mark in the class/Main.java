#include<bits/stdc++.h>
using namespace std;
int main()
{
  // Type your code here
  int T;
  cin >> T;
  int arr[T];
  for(int i = 0;i < T;i++)
    cin >> arr[i];
  sort(arr,arr+T);
  cout << arr[T-1];
}