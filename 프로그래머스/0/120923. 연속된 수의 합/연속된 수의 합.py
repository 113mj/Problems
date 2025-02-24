def solution(num, total):
    answer = []
    if num % 2 == 1:
        # 홀수인 경우
        mid_num = total // num
        for i in range(mid_num - (num-1) // 2, mid_num + (num-1) // 2 + 1):
            answer.append(i)
    else:
        # 짝수인 경우
        mid_num = total // num
        for i in range(mid_num - (num // 2) + 1 , mid_num + (num // 2) + 1):
            answer.append(i)
    return answer