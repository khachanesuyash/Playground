#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  vector<int> row;
  cin >> r >> c;
  int arr[r][c], sum=0;
  for(int i = 0;i < r; i++)
    for(int j = 0;j < c;j++)
      cin >> arr[i][j];

  cout << "Sum of rows is ";
  for(int i = 0;i < r;i++){
    for(int j = 0;j < c; j++){
      sum += arr[i][j];
    }
    cout << sum << " ";
    row.push_back(sum);
    sum = 0;
  }
  int item = *max_element(row.begin(),row.end());
  vector<int>::iterator pos = find(row.begin(), row.end(), item);
  cout << "\nRow " << pos - row.begin()+1 << " has maximum sum";
  row.clear();
  cout << "\nSum of columns is ";
  for(int i = 0;i < r;i++){
    for(int j = 0;j < c; j++){
      sum += arr[j][i];
    }
    cout << sum << " ";
    row.push_back(sum);
    sum = 0;
  }
  item = *max_element(row.begin(),row.end());
  pos = find(row.begin(), row.end(), item);
  cout << "\nColumn " << pos - row.begin()+1 << " has maximum sum";
}