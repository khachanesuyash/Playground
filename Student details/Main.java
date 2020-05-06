#include<bits/stdc++.h>
using namespace std;
struct College { char name[100]; char dept[100]; int year; float cgpa; }; 
/*int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct College*)p)->name, 
                  ((struct College*)q)->name); 
} */
int main()
{
  //Type your code here.
  int n;
  cout << "Enter the number of students";
  cin >> n;
  College clg[n];
  for(int i = 0;i < n; i++){
    cout << "\nEnter the details of student " << i+1;
    cout << "\nEnter name";
    cin.ignore();
    cin  >> clg[i].name;
    cout << "\nEnter department";
    //cin.ignore();
    cin >> clg[i].dept;
    cout << "\nEnter year of study";
    cin >> clg[i].year;
    cout << "\nEnter cgpa";
    cin >> clg[i].cgpa;
  }
  //qsort(clg, n, sizeof(struct College), comparator);
  for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n - 1; j++)
        {
            if(strcmp(clg[j].name, clg[j + 1].name) > 0)  //change to < 0 for descending sort
            {
                College temp = clg[j];
                clg[j] = clg[j + 1];
                clg[j + 1] = temp;
            }
        }
    }
  cout << "\nDetails of students";
  for(int i = 0;i < n; i++){
    cout << "\nStudent " << i+1;
    cout << "\nName:" << clg[i].name;
    cout << "\nDepartment:" << clg[i].dept;
    cout << "\nYear of study:" << clg[i].year;
    cout << "\nCGPA:" << clg[i].cgpa;
  }
}