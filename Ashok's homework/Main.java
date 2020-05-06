#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin >> r >> c;
  int arr[r][c], arr1[r][c],sum[r][c];
  for(int i = 0;i < r; i++){
    for(int j = 0;j < c;j++)
      cin >> arr[i][j];
  }
  for(int i = 0;i < r; i++){
    for(int j = 0;j < c;j++)
      cin >> arr1[i][j];
  }
  
  for(int i = 0;i < r; i++){
    for(int j = 0;j < c;j++)
      sum[i][j] = arr[i][j] + arr1[i][j];
  }
  
  for(int i = 0;i < r; i++){
    for(int j = 0;j < c;j++)
      cout << sum[i][j] << " ";
    cout << endl;
  }
  
}