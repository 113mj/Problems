def solution(polynomial):
    temp = polynomial.split()
    print(temp)
    answer_num = 0
    answer_x = 0
    for i in temp:
        if i.isdigit():
            answer_num += int(i)
        elif i[-1] == 'x':
            if i == 'x':
                answer_x += 1
            else:
                answer_x += int(i[0:-1])
    if answer_x==0:
        return f"{answer_num}"
    elif answer_x==1:
        if answer_num==0:
            return 'x'
        return f"x + {answer_num}"
    elif answer_num==0:
        return f"{answer_x}x"
    else:
        return f"{answer_x}x + {answer_num}"