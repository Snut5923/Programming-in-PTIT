import socket
import hashlib

def main():
    host = '127.0.0.1'
    port = 1234
    key = "b21dcat212"

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((host, port))

    # Người dùng nhập thông điệp
    message = input("Nhập thông điệp muốn gửi đến server: ")

    # Tạo giá trị băm của (thông điệp + key)
    hash_object = hashlib.sha256()
    hash_object.update((message + key).encode())
    hashed = hash_object.hexdigest()

    # Gửi thông điệp và giá trị băm đến server
    data = message + ";" + hashed
    client_socket.send(data.encode())

    # Nhận và hiển thị phản hồi từ server
    response = client_socket.recv(1024).decode()
    print("Thông điệp nhận được từ server:", response)

    client_socket.close()

if __name__ == "__main__":
    main()
