#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void countingSort(vector<int>& arr){

    if (arr.empty()) return;

    int maxVal = *max_element(arr.begin(), arr.end());

    vector<int> count(maxVal + 1, 0);
    
    for (int num : arr) {
        count[num]++;
    }

    arr.clear();

    for (int i = 0; i  < count.size(); i++){
        while (count[i] > 0){
            arr.push_back(i);
            count[i]--;
        }
    }
}

int main(){
    vector<int> myarr = {3, 2, 4, 5, 8, 11, 8, 45, 22, 65, 32, 87, 54, 99, 12, 34, 21, 56};

    countingSort(myarr);

    cout << "Sorted Array : ";
    for (int num: myarr){
        cout << num << " ";
    }
    cout << endl;
    return 0;
}
