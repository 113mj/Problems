result = 0
for i in range(5):
    score=int(input())

    if score <40: 
        score = 40
    result += score
average=int(result/5)
print(average) 