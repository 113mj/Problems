def solution(my_string):
    num_list = []
    string_list = list(my_string)
    answer = 0
    for i in range(len(string_list)):
        if string_list[i].isalpha() == False:
            num_list.append(int(string_list[i]))
    for i in num_list:
        answer += i
    return answer