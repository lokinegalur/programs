//Move all the negative elements to one side of the array

#include <bits/stdc++.h>

using namespace std;

int main()
{

    int n, i;
    cin >> n;
    int a[n];
    vector<int> neg, pos;
    for (i = 0; i < n; i++)
        cin >> a[i];
    for (i = 0; i < n; i++)
    {
        if (a[i] < 0)
            neg.push_back(a[i]);
        else
            pos.push_back(a[i]);
    }
    for (int j : neg)
        cout << j << "\t";
    for (int j : pos)
        cout << j << "\t";
    cout << endl;
}