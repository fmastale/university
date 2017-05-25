#include <iostream>

using namespace std;

int main()
{
    int how_many = 0;
    int sum = 0;
    int number = 0;
    int digit = 0;
    int even_counter = 0;

    cout << "How many numbers should be putted in a row: " << endl;
    cin >> how_many;

    for (int i = 0; i < how_many; i++)
    {
        cout << "Write your " << i + 1 << " number in a row" << endl;
        cin >> number;
        digit = number % 10;
        if (digit % 2 == 0)
        {
            sum += number;
            even_counter++;
        }
    }

    cout << "There were " << even_counter << " numbers which can be divided by 2 and your sum is equals: " << sum << endl;

    return 0;
}
