def solution(age):
    dict_age = {
        0 : "a",
        1 : "b",
        2 : "c",
        3 : "d",
        4 : "e",
        5 : "f",
        6 : "g",
        7 : "h",
        8 : "i",
        9 : "j"
    }
    age_list = []
    answer = []
    while age  >= 10:
        age_list.append(age % 10)
        age = age // 10
    age_list.append(age)
    
    for i in age_list:
        temp = dict_age[i]
        answer.append(temp)

    answer.reverse()
    return ''.join(answer)