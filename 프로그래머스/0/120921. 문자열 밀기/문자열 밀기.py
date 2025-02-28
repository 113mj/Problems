def solution(A, B):
    if A == B:
        return 0
    else:
        count = 0
        for i in A:
            back = A[-1]
            A = back + A[0:len(A)-1]
            count+=1
            if A == B:
                return count
            
    return -1
            
    