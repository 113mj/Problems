def solution(score):
    grade = []
    answer = []
    total = 0
    
    for i in score:
        for j in i:
            total += j
        total /= 2
        grade.append(total)
        total = 0
    
    sort_grade = sorted(grade, reverse = True)
    
    for i in grade:
        answer.append(sort_grade.index(i)+1)
    
    return answer