def insertionSort(arr:list, size:int) -> None:
    for i in range(1,size):
        chkindex = i
        val = arr[i]
        for j in range(i-1,-1,-1):
            if arr[j] > val:
                arr[j+1] = arr[j]
                chkindex = j
            else:
                break
        arr[chkindex] = val
    
    print(arr)
    
arr:list = [3,2,4,5,8,11,8,45,22,65,32,87,54,99,12,34,21,56]
arrLen:int = len(arr)
insertionSort(arr, arrLen)