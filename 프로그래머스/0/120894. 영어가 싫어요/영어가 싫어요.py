def solution(numbers):
    answer = ''
    alpha_list = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" ]
    num_list = [str(i) for i in range(10)]
    alpha_dict = dict(zip(alpha_list, num_list))
    first = ''
    for i in numbers:
        first+=i
        if first in alpha_dict:
            answer+=alpha_dict[first]
            first=''
            continue
    return int(answer)