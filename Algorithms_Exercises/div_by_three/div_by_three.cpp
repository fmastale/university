#include <iostream>

using namespace std;

int main()
{
    int number = 0;
    int digit = 0;
    bool can_be_divided = false;

    cout << "Put your number: " << endl;
    cin >> number;

    do
    {
        digit = number % 10;

        if (digit % 3 == 0)
            can_be_divided = true;

        number /= 10;

    } while (number != 0);

    if (can_be_divided == true)
        cout << "Number has got digit wich can be divided by three" << endl;
    else
        cout << "Number hasn't got digit wich can be divided by three" << endl;

    return 0;
}
