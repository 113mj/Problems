def solution(numbers, direction):
    answer = numbers[:]
    if direction == 'right':
        for i in range(len(numbers)):
            if i == 0:
                answer[i] = numbers[len(numbers)-1]
            else:
                answer[i] = numbers[i-1]
    else :
        for i in range(len(numbers)):
            if i == len(numbers) -1:
                answer[i] = numbers[0]
            else:
                answer[i] = numbers[i+1]
    return answer