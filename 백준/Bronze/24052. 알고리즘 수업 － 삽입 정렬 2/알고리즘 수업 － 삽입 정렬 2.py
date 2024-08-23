n, k = map(int, input().split())
arr = list(map(int, input().split()))

cnt = 0

for i in range(1, n):
    loc = i - 1
    newItem = arr[i]

    while loc >= 0 and newItem < arr[loc]:
        arr[loc + 1] = arr[loc]
        loc -= 1
        cnt += 1
        if cnt == k:
            print(*arr)
            break
    
    if loc + 1 != i:
        arr[loc + 1] = newItem
        cnt += 1
        if cnt == k:
            print(*arr)
            break

if cnt < k:
    print(-1)