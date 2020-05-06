#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int N,M,maxElement = INT_MIN;
  cin >> N >> M;
  int mat[N][M];
  for (int i = 0; i < N; i++)
    for (int j = 0; j < M; j++)
      cin >> mat[i][j];
  for (int i = 0; i < N; i++) { 
        for (int j = 0; j < M; j++) { 
            if (mat[i][j] > maxElement) { 
                maxElement = mat[i][j]; 
            } 
        } 
    }
  cout << "The maximum element is " << maxElement;
}