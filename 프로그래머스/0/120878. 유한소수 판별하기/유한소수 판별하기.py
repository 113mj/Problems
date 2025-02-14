def solution(a, b):
    max = 1
     # 기약분수로 먼저 나타내기
    if a > b:
        for i in range(1, b+1):
            if a % i ==0 and b % i== 0:
                max = i
    else:
        for i in range(1, a+1):
            if a % i ==0 and b % i== 0:
                max = i
    # 그 다음 기약분수의 분모가 소인수 분해 시 2와 5만 존재하면 1 아니면 2
    a /= max
    b /= max
    while True:
        if b % 5 == 0:
            b /= 5
            print(b)
        elif b % 2 == 0:
            print(b)
            b /= 2
        else:
            break
    if int(b) == 1:
        answer = 1
    else:
        answer = 2
    return answer