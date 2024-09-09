def shell_sort(arr):
    n = len(arr)
    gap = n//2
    
    while gap > 0:
        for i in range(gap,n):
            temp = arr[i]
            j = i
            while j >= gap and arr[j-gap] >temp:
                arr[j] = arr[j-gap]
                j -= gap
            arr[j] = temp
        gap //= 2

arr = [ 5, 25, 2, 19, 43, 90, 8, 1]
shell_sort(arr)
 
for i in range(len(arr)):
    print(arr[i]),
