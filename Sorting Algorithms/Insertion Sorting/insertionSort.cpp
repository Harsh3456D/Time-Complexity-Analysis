#include <iostream>
#include <array>

using namespace std;

void insertionSort(int arr[],int size){
    for (int i = 1; i < size; i++){
        int chkindex = i;
        int val = arr[i];

        for (int j = i-1; j > -1; j--){
            if (arr[j] > val){
                arr[j+1] = arr[j];
                chkindex = j;
            }
        else {
            break;
        }
        }
    arr[chkindex] = val;
    }
    for ( int k=0; k < size; k++){
        cout << arr[k] << " ";
    }
    cout << endl;
}

int main(){
    int myarr[] = {3,2,4,5,8,11,8,45,22,65,32,87,54,99,12,34,21,56};
    int size = sizeof(myarr) / sizeof(myarr[0]);
    insertionSort(myarr, size);
    return 0;
}