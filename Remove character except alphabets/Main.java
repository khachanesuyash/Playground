#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin >> s;
      for (int i = 0; i < s.size(); i++) { 
          
        // Finding the character whose  
        // ASCII value fall under this 
        // range 
        if (s[i] < 'A' || s[i] > 'Z' && 
            s[i] < 'a' || s[i] > 'z')  
        {    
            // erase function to erase  
            // the character 
            s.erase(i, 1);  
            i--; 
        } 
    } 
    cout << s; 
}