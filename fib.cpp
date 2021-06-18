#include <bits/stdc++.h>

using namespace std;
int n;
int mem[100];
int memfib(int n)
{
    if (mem[n] == -1)
    {
        int res;
        if (n == 0 || n == 1)
            res = n;
        else
            res = memfib(n - 1) + memfib(n - 2);

        mem[n] = res;
    }
    return mem[n];
}

int tabfib(int n)
{
    int f[n + 1];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++)
        f[i] = f[i - 1] + f[i - 2];
    return f[n];
}

int main()
{

    cout << "Enter the value for n" << endl;
    cin >> n;
    for (int i = 0; i <= n; i++)
        mem[i] = -1;

    int choice;
    cout << "Enter your choice\n";
    cout << "1. Memoization\n2. Tabulation\n";
    cin >> choice;
    if (choice == 1)
        cout << "Fibonacci of " << n << " is " << memfib(n) << endl;

    else if (choice == 2)
        cout << "Fibonacci of " << n << " is " << tabfib(n) << endl;

    else
        cout << "Enter either 1 or 2\n";

    return 0;
}
