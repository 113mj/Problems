def solution(board):
    
    count = 0
    
    n = len(board)
    
    dx = [0, 0, -1, 1, 1, 1, -1, -1]
    dy = [1, -1, 0, 0, 1, -1, 1, -1]
    
    bomb = []
    
    for x in range(n):
        for y in range(n):
            if board[x][y] == 1:
                bomb.append((x, y))
                
    for x, y in bomb:
        for i in range(8):
            
            xi = x + dx[i]
            yi = y + dy[i]
            
            if 0 <= xi < n and 0 <= yi < n:
                board[xi][yi] = 1           
                
    for row in board:
        count += row.count(0)
    
    return count