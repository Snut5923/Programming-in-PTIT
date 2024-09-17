from itertools import combinations

# Tạo ra tất cả các tổ hợp từ 1 đến 10 với kích thước là 3
combs = combinations(range(1, 11), 10)

# In ra 3 tổ hợp bất kỳ
for comb in combs:
    print(comb)
