#include<iostream>
using namespace std;
struct College { char name[100]; char city[100]; int establishmentYear; float passPercentage; }; 
int main()
{
  //Type your code here.
  int n;
  cout << "Enter the number of colleges";
  cin >> n;
  College clg[n];
  for(int i = 1;i <= n; i++){
    cout << "\nEnter the details of college " << i;
    cout << "\nEnter name";
    cin.ignore();
    cin.getline(clg[i].name,100);
    cout << "\nEnter city";
    //cin.ignore();
    cin.getline(clg[i].city,100);
    cout << "\nEnter year of establishment";
    cin >> clg[i].establishmentYear;
    cout << "\nEnter pass percentage";
    cin >> clg[i].passPercentage;
  }
  cout << "\nDetails of colleges";
  for(int i = 1;i <= n; i++){
    cout << "\nCollege:" << i;
    cout << "\nName:" << clg[i].name;
    cout << "\nCity:" << clg[i].city;
    cout << "\nYear of establishment:" << clg[i].establishmentYear;
    cout << "\nPass percentage:" << clg[i].passPercentage;
  }
}