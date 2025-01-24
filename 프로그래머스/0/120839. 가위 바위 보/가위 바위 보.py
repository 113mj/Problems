def solution(rsp):
    win = {
        '2' : '0',
        '0' : '5',
        '5' : '2',
    }
    answer = ''
    for i in list(rsp):
        answer += win[i]
    return answer