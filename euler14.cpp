#include <iostream>
using namespace std;
 
int main () {
    long long n = 1000000;
    long long answer;
    int count = 1;
    int longestChain = 0;
     
    for (int temp = n; temp > n-(n/5) ; temp--) {
        while (n != 1) {
            if ((n%2) == 0) n = n/2;
            else n = (n*3) + 1;
            count++;
        }
    
        if (longestChain < count) {
            longestChain = count;
            answer = temp+1;
        }

        n = temp;
        count = 1;
    
    }
     
    cout << answer << " has a pretty long chain: " << longestChain << endl;
}