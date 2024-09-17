doc = ''
# while True:
#     try:
#         s = open("1.txt",'r')
#         doc += s.read()
#         print(doc)
#         if doc[-1] not in '.?!': doc+=' .'
#         else:
#             if doc[-2] != ' ': doc = f'{doc[:-1]} {doc[-1]}'
#         doc += ' '
#     except:
#         break
s = open("1.txt", 'r')
doc += s.read()
print(doc)
if doc[-1] not in '.?!':
    doc += ' .'
else:
    if doc[-2] != ' ': doc = f'{doc[:-1]} {doc[-1]}'
doc += ' '


words = doc.split()
print(words)
i = 0
while i<len(words):
    sen = ''
    while i<len(words) and words[i] not in '.?!':
        sen+=words[i]+' '
        i+=1
    if words[i] in '.?!': sen = sen[:-1] + words[i]
    i+=1
    print(sen[0].upper() + sen[1:].lower())