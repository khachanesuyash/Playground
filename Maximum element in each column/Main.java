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
  for(int j = 0;j < c;j++){
      temp = arr[0][j];
    for(int i = 1;i < r; i++){
      if(arr[i][j] > temp)
        temp = arr[i][j];
    }
    cout << temp << endl;
    /*r(int i = 1;i < r; i++){
      temp = arr[1][1];
      if(arr[i][1] > temp)
        temp = arr[i][1];
    }
    cout << temp;*/
  }
}