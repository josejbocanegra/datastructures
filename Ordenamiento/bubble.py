def bubble_sort(arr):
    for i in range(len(arr) - 1):
        for j in range(i + 1, len(arr)):
            if(arr[i] > arr[j]):
                arr[i], arr[j] = arr[j], arr[i]

arr = [ 5, 25, 2, 19, 43, 90, 8, 1]
bubble_sort(arr)
 
for i in range(len(arr)):
    print(arr[i]),
