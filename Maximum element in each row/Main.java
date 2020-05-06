#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin >> r >> c;
  int arr[r][c];
  for(int i = 0;i < r; i++)
    for(int j = 0;j < c;j++)
      cin >> arr[i][j];
  int temp;
  for(int j = 0;j < r;j++){
      temp = arr[j][0];
    for(int i = 1;i < c; i++){
      if(arr[j][i] > temp)
        temp = arr[j][i];
    }
    cout << temp << endl;

  }
}