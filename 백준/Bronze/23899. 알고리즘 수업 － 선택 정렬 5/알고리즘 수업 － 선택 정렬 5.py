n = int(input())
arr = list(map(int, input().split()))
b = list(map(int, input().split()))

if arr == b:
    print(1)
else:
    for last in range(n-1, 0, -1):
        max_idx = 0
        for i in range(1, last + 1):
            if arr[i] > arr[max_idx]:
                max_idx = i

        if max_idx != last:
            arr[last], arr[max_idx] = arr[max_idx], arr[last]

        if arr == b:
            print(1)
            break
    else:
        print(0)
