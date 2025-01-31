def solution(order):
    order_list = str(order)
    answer = 0
    for i in order_list:
        if i == '3' or i == '6' or i == '9':
            answer +=1
    return answer