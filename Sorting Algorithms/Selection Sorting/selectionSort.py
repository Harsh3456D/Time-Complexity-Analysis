def selectionSort(arr:int, size:int) -> None:

    for i in range(size):
        subindex = i
        for j in range(i+1, size):
            if arr[j] < arr[subindex]:
                subindex = j
        arr[i],arr[subindex] = arr[subindex],arr[i]
    
    print(arr)

arr:list = [3,2,4,5,8,11,8,45,22,65,32,87,54,99,12,34,21,56]
arrLen:int = len(arr)
selectionSort(arr, arrLen)