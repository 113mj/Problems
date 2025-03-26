def solution(ineq, eq, n, m):
    temp = ineq + eq
    if temp ==">=":
        if n >= m:
            return 1
        else:
            return 0
    elif temp =="<=":
        if n <= m:
            return 1
        else:
            return 0
    elif temp =="<!":
        if n < m:
            return 1
        else:
            return 0
    elif temp ==">!":
        if n > m:
            return 1
        else:
            return 0