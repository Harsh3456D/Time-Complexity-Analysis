def linearSearch(arr:list, size:int, target:int) -> any:
    for i in range(size):
        if arr[i] == target:
            print(f"The searched item is at {i}")


mylist = [2,4,6,7,12,22,27,37,43,54,74,89,99]
target = 7
result = linearSearch(mylist,len(mylist),target)
