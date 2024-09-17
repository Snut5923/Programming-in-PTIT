import socket
import hashlib

def main():
    host = '127.0.0.1'
    port = 1234
    key = "b21dcat212"

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind((host, port))
    server_socket.listen(1)

    print("Server đang lắng nghe cổng", port)

    while True:
        conn, addr = server_socket.accept()
        print("Kết nối bởi", addr)

        data = conn.recv(1024).decode()
        message, hashed = data.split(";")  # Tách thông điệp và giá trị băm

        # Kiểm tra tính toàn vẹn của thông điệp
        hash_object = hashlib.sha256()
        hash_object.update((message + key).encode())
        if hashed == hash_object.hexdigest():
            print("Thông điệp toàn vẹn")

            # Trả lời client
            response = "Hello, I am b21dcat212 server."
            conn.send(response.encode())
        else:
            print("Thông điệp mất tính toàn vẹn")

        conn.close()

if __name__ == "__main__":
    main()
