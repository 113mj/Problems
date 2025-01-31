def solution(array, n):
    MAX = 9999
    answer = -1

    array.sort()
    for a in array:
        if abs(n - a) < MAX:
            MAX = abs(n - a)
            answer = a

    return answer