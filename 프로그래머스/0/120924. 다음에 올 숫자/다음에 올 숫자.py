def solution(common):
    if(common[1] - common[0] == common[2] - common[1]):
        diff = common[1] - common[0]
        return common[0] + diff * (len(common))
    else:
        diff = common[1] / common[0]       
        return common[0] * (diff ** len(common))