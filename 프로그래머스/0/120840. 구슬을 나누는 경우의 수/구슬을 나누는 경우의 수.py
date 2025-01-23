def fact(num):
    if num == 1 or num == 0:
        return 1
    else:
        return num * fact(num-1)
    
def solution(balls, share):
    answer = fact(balls) / (fact(share) * fact(balls - share))
    return answer
