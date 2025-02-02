def solution(s):
    answer = ''
    s_list=[]
    answer_list=[]
    for i in s:
        if i in answer_list:
            answer_list.remove(i)
            s_list.append(i)
        if i in s_list:
            continue
        answer_list.append(i)

    return ''.join(sorted(answer_list))