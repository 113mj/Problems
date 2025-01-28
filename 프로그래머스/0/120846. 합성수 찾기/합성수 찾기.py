def solution(n):
    answer = 0
    for i in range(1, n+1):
        n = 0
        for j in range(1, i+1):
            if i//j==i/j:
                n+=1
        if n>=3:
            answer+=1
    return answer