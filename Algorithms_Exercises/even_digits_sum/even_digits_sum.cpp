#include <iostream>

using namespace std;

int main()
{
    int number = 0;
    int sum = 0;
    int digit = 0;

    cout<< "Put your number: "<<endl;
    cin>> number;

    do
    {
        digit = number % 10;

        if (digit % 2 == 0)
            sum += digit;

        number /= 10;

    } while (number != 0);

    cout<<"Your sum equals to: "<< sum <<endl;

    return 0;
}

