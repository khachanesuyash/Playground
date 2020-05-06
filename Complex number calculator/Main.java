#include<iostream>
using namespace std;
struct complex
{
int rel;
int img;
}s1,s2;

int main()
{
int a,b;
  int ch;
  cin >> ch;
cin>>s1.rel>>s1.img;
cin>>s2.rel>>s2.img;

if (ch==1){
a=(s1.rel)+(s2.rel);
b=(s1.img)+(s2.img);
}
//Subtraction
else if(ch == 2){
  a=(s1.rel)-(s2.rel);
b=(s1.img)-(s2.img);
}
//Multiplication
else if (ch == 3){
  a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
b=((s1.rel)*(s2.img))+((s2.rel)*(s1.img));
}
  else
    cout << "Invalid choice";
  if(b>=0 && (ch == 1 || ch == 2 || ch == 3))
   cout<<a<<"+"<<b<<"i"<<endl;
  else if(ch == 1 || ch == 2 || ch == 3)
   cout<<a<<b<<"i"<<endl;

}