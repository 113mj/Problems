import sys
input = sys.stdin.readline

n = int(input())
sell = {}

for i in range(n):
    name = input()
    if name not in sell:
        sell[name] = 1
    else:
        sell[name] += 1

maxValue = max(sell.values())

best = []
for key, value in sell.items():
    if value == maxValue:
        best.append(key)

best = sorted(best)
print(best[0])