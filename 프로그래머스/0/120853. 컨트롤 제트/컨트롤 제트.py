def solution(s):
    answer = 0
    temp=0
    s = s.split()
    for i in s:
        if i=='Z':
            answer-=temp
            continue
        temp=int(i)
        answer+=int(i)
    return answer