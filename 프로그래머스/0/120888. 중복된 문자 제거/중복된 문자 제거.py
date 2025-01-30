def solution(my_string):
    k = 0
    temp = ''
    for i in my_string :
        if i in temp :
            continue 
        else :
            temp += i
    answer = temp
    return answer