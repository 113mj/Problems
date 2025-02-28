def solution(bin1, bin2):
    addition = int(bin1,2)+int(bin2, 2) 
    answer = bin(addition)[2:]
    return answer