def solution(num, k):
    num_list = list(str(num))  
    k = str(k)  
    for idx, i in enumerate(num_list):
        if i == k:
            return idx + 1  
    return -1  
