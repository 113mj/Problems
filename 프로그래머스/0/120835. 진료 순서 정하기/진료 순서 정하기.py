def solution(emergency):
    answer = []
    for i in emergency:
        temp = 1  
        for j in range(len(emergency)):
            if i < emergency[j]:  
                temp += 1
        answer.append(temp)
    return answer