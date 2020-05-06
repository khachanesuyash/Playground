#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int sum = 0,rem,count = 0;
  int temp = n;
  while(n){
    count++;
    n/=10;
  }
  //std::cout << count;
  n = temp;
  while(n){
    rem = n%10;
    sum += power(rem,count);
    n/=10;
  }
  return (sum == temp);
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}