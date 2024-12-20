N = int(input())

for i in range(1, N + 3, 1):
    if i == 1 or i == N + 2:
        print('@' * (N+2))
    else:
        print('@' + ' ' * N + '@')