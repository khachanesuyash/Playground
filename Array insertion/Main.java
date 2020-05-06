#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int T, ele;
  cout << "Enter the number of elements in the array";
  cin >> T;
  vector<int> g1;
  cout << "\nEnter the elements in the array";
  for(int i = 0;i < T; i++){
    cin >> ele;
    g1.push_back(ele);
  }
  cout << "\nEnter the location where you wish to insert an element";
  int pos;
  cin >> pos;
  if(pos <= g1.size()){
    cout << "\nEnter the value to insert";
    int item;
    cin >> item;
    g1.insert(g1.begin()+pos-1,item);
    cout << "\nArray after insertion is\n";
    for (auto it : g1) 
      cout << it << endl; 
  }
  else
    cout << "\nInvalid Input"; 
  
 
}