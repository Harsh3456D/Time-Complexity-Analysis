def countingSort(arr:list) -> list:
    maxVal:int = max(arr)
    count:int = [0] * (maxVal + 1)
    
    while len(arr) > 0:
        num = arr.pop(0)
        count[num] += 1 
    
    for i in range(len(count)):
        while count[i] > 0: 
            arr.append(i)
            count[i] -= 1
    
    return arr

myarr:list = [3,2,4,5,8,11,8,45,22,65,32,87,54,99,12,34,21,56]
Sortarr:list = countingSort(myarr)
print(Sortarr)


