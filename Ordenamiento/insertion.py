def insertion_sort(arr):
    n = len(arr)
    
    for i in range(1, n): 
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]: 
            arr[j+1] = arr[j] 
            j -= 1
        arr[j+1] = key  
  
arr = [ 5, 25, 2, 19, 43, 90, 8, 1]
insertion_sort(arr)
 
for i in range(len(arr)):
    print(arr[i]),
