def solution(babbling):
    answer = 0
    for i in babbling:
        baby_word = {'aya','woo','ye','ma'}
        while True:
            if i[:3] in baby_word:
                baby_word.discard(i[:3])
                i = i[3:]
            elif i[:2] in baby_word:
                baby_word.discard(i[:2])
                i = i[2:]
            else:
                break
        if i == '':
            answer += 1
    return answer