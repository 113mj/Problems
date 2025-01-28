def factorial(n):
    if n == 1 or n == 0:
        return 1
    else:
        return  n * factorial(n-1)

def solution(n):
    i = 1
    answer = 1
    while True:
        if factorial(i) <= n:
            i += 1
            answer += 1
        else:
            answer -=1
            break
    return answer