import math
import random
#kiểm tra số nguyên tố

def check_nt(n):
    for i in range(2, int(math.sqrt(n))+1):
        if n % i ==0:
            return False
    return n>1


#tạo số nguyên tố ngẫu nhiên trong khoảng

def generate(min_val,max_val):
    n=random.randint(min_val,max_val)
    while check_nt(n)==False:
        n=random.randint(min_val,max_val)
    return n

#tính module đảo (tạo khoá bí mật)

def tinh_mod_dao(a,m):
    m0, x0, x1 = m, 0, 1
    while a > 1:
        q = a // m
        m, a = a % m, m
        x0, x1 = x1 - q * x0, x0
    return x1 + m0 if x1 < 0 else x1



#tạo khoá công khai
def tao_e(phi):
    # cac lua chon so e thuong la 3, 17, 65537
    # o day ta se chon 65537
    e = 65537
    while math.gcd(e, phi) != 1:
        e += 2
    return e

def encrypt(message, public_key):
    e, n = public_key
    encrypted_msg = [pow(ord(char), e, n) for char in message]
    return encrypted_msg

def decrypt(encrypted_msg, private_key):
    d, n = private_key
    decrypted_msg = [chr(pow(char, d, n)) for char in encrypted_msg]
    return ''.join(decrypted_msg)

min_val=10000
max_val=80000

p=generate(min_val,max_val)
q=generate(min_val,max_val)
while p==q:
    q=generate(min_val,max_val)

n=p*q

phi_n=(p-1)*(q-1)

e=tao_e(phi_n)

d=phi_n+tinh_mod_dao(e,phi_n)
public_key = (e,n)
private_key = (d,n)

message="i am b21dcat212"
print("Bản rõ:",message)
print("p =",p,"q =",q,"n =",n,"phi_n =",phi_n,"e =",e,"d =",d)
print("Sau khi mã hoá thành công:")
enc = encrypt(message,public_key)
print(enc)
print("Sau khi giải mã thành công:")
print(decrypt(enc,private_key))

