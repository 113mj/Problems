def solution(my_string):
    temp = ''
    answer = 0
    my_string.split()
    for i in my_string:
        if i.isdigit():
            temp += i
        else:
            if len(temp) >= 1:
                answer += int(temp)
                temp = ''
    if len(temp)>=1:
        answer+=int(temp)
        prefix=''
    return answer
