def solution(quiz):
    answer = []
    for i in quiz:
        temp = 0
        i_list = i.split(" ")
        
        if i_list[1] == "+":
            temp = int(i_list[0]) + int(i_list[2])
        else:
            temp = int(i_list[0]) - int(i_list[2])
        
        if temp == int(i_list[4]):
            answer.append("O")
        else:
            answer.append("X")
    return answer