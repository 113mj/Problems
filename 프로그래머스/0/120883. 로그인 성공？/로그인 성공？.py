def solution(id_pw, db):
    user_db = []
    for i in db:
        temp = []
        for j in i:
            temp.append(j)
        user_db.append(temp)
    
    for i in user_db:
        if id_pw[0] == i[0]:
            if id_pw[1] == i[1]:
                return "login"
            else:
                return "wrong pw"
    return "fail"