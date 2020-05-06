#include<iostream>
using namespace std;
int main()
{
    /* variable definition and initialization */   
    int n, i, c = 0;
    
cin>>n;
    
    /*logic*/    for (i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
           c++;
        }
    }
    if (c == 2)
    {
       cout << "Eligible" << endl;
    }
    else
    {
         cout << "Not eligible" << endl; 
    }
    return 0;    
}