def selection_sort(arr):
    size = len(arr)
    for ind in range(size):
        min_index = ind
        for j in range(ind + 1, size):
            if (arr[j] < arr[min_index]):
                min_index = j
        (arr[ind], arr[min_index]) = (arr[min_index], arr[ind])

arr = [ 5, 25, 2, 19, 43, 90, 8, 1]
selection_sort(arr)
 
for i in range(len(arr)):
    print(arr[i]),
