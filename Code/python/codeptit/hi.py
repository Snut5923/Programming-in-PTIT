def decrypt(cipher, key):
    plaintext = ""
    for char in cipher:
        decrypted_char = chr(char // key // 311)
        plaintext += decrypted_char
    return plaintext

def dynamic_xor_decrypt(cipher_text, text_key):
    decrypted_text = ""
    key_length = len(text_key)
    for i, char in enumerate(cipher_text):
        key_char = text_key[i % key_length]
        decrypted_char = chr(ord(char) ^ ord(key_char))
        decrypted_text += decrypted_char
    return decrypted_text

def test_decrypt(cipher_text, text_key, shared_key):
    semi_decipher = decrypt(cipher_text, shared_key)
    deciphered_text = dynamic_xor_decrypt(semi_decipher, text_key)
    print(f'Deciphered text is: {deciphered_text}')

# Example usage:
if __name__ == "__main__":
    # Assuming you have the ciphertext and shared key from the encryption process
    cipher_text = [260307, 491691, 491691, 2487378, 2516301, 0, 1966764, 1879995, 1995687, 1214766, 0, 2400609, 607383, 144615, 1966764, 0, 636306, 2487378, 28923, 1793226, 694152, 780921, 173538, 173538, 491691, 173538, 751998, 1475073, 925536, 1417227, 751998, 202461, 347076, 491691]

    shared_key = 93  # This is the shared key obtained from the encryption process
    test_decrypt(cipher_text, "trudeau", shared_key)
a = "}cd22a157_d6tp0rc2d_motsuc{FTCocip"
print(a[::-1])