def solution(my_string, num1, num2):
    my_string_list = list(my_string)
    temp1 = my_string_list[num1]
    temp2 = my_string_list[num2]
    my_string_list[num1] = temp2
    my_string_list[num2] = temp1
    answer = "".join(my_string_list)
    
    return answer