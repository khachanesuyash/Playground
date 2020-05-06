#include<iostream>
using namespace std;
int main()
{
  int t,sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, flag = 1;
  cin >> t;
  int arr[t][t];
  for(int i = 0;i < t; i++){
    for(int j = 0;j < t; j++){
      cin >> arr[i][j];
      if(i == j)
        sum += arr[i][j];
    }
  }
  
  for(int i = 0;i < t; i++){
    for(int j = 0;j < t; j++){
      sum1 += arr[i][j];
      sum2 += arr[j][i];
      if(i+j+1 == t)
        sum3 += arr[i][j];
    }
    if(sum1 != sum || sum2 != sum){
      flag = 0;
      break;
    }
    sum1 = 0;
    sum2 = 0;
  }
  
  if(flag == 1 && sum == sum3)
    cout << "Yes";
  else
    cout << "No";
}