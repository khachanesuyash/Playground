#include<iostream>
using namespace std;
struct emp{
  char name[30], des[30];
  int ID, age, sal;
}e;
int main()
{
  //Type your code here.
  
  cout << "Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details";
  cin.getline(e.name,30);
  cin >> e.ID >> e.age;
  cin.ignore();
  cin.getline(e.des,30);
  cin >> e.sal;
  cout << "\nName of the Employee : " << e.name;
  cout << "\nID of the Employee : " << e.ID;
  cout << "\nAge of the Employee : " << e.age;
  cout << "\nDesignation of the Employee : " << e.des;
  cout << "\nSalary of the Employee : " << e.sal;
}