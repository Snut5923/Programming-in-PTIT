def read_file_to_list(file_path):
    with open(file_path, 'r') as file:
        lines = [line.strip() for line in file.readlines()]
    return lines
kq = []
a = read_file_to_list("CONTACT.in")
for i in a:
    kq.append(i.lower())
b = list(set(kq))
b.sort()
for i in b:
    print(i)