import sys
input = sys.stdin.readline

def func(n):
    if n==1 or n == 0:
        return 1
    return n * func(n-1)

N = int(input())

print(func(N) // (func(N-5)*func(5)))