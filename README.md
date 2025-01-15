# CNS Lab

This repository contains a collection of programs and algorithms commonly used in Computer Network Security (CNS) labs. Each file implements a specific cryptographic or security-related algorithm. Below is a detailed description of the directory structure and the contents of the repository.

## Directory Structure
```
└── muralimallela-cns_lab/
    ├── 10_BlowFish_algorithm.java
    ├── 11_Rijndael_algorithm.java
    ├── 1_XOR_with_0.c
    ├── 2_AND_XOR_127.c
    ├── 3_a_ceaser_cipher.c
    ├── 3_b_substitution_cipher.c
    ├── 3_c_hill_cipher.java
    ├── 4_RSA_algorithm.java
    ├── 5_Diffie_Hellman_Key_Exchange_algorithm.java
    ├── 6_SHA_1_algorithm.java
    ├── 7_MD5_algorithm.java
    ├── 8_Hello_world_BlowFish.java
    └── 9_DES_algorithm.java
```

## File Descriptions

### Java Files
- **10_BlowFish_algorithm.java**: Implementation of the Blowfish encryption algorithm.
- **11_Rijndael_algorithm.java**: Implementation of the Rijndael algorithm (basis for AES).
- **3_c_hill_cipher.java**: Implementation of the Hill cipher, a polygraphic substitution cipher.
- **4_RSA_algorithm.java**: Implementation of the RSA encryption and decryption algorithm.
- **5_Diffie_Hellman_Key_Exchange_algorithm.java**: Demonstrates the Diffie-Hellman key exchange process.
- **6_SHA_1_algorithm.java**: Implementation of the SHA-1 hashing algorithm.
- **7_MD5_algorithm.java**: Implementation of the MD5 hashing algorithm.
- **8_Hello_world_BlowFish.java**: A simple "Hello World" implementation of the Blowfish algorithm.
- **9_DES_algorithm.java**: Implementation of the Data Encryption Standard (DES) algorithm.

### C Files
- **1_XOR_with_0.c**: Demonstrates the XOR operation with 0.
- **2_AND_XOR_127.c**: Demonstrates bitwise AND and XOR operations with 127.
- **3_a_ceaser_cipher.c**: Implementation of the Caesar cipher.
- **3_b_substitution_cipher.c**: Implementation of a simple substitution cipher.

## Getting Started

### Prerequisites
- **Java Compiler**: Ensure you have JDK installed to compile and run the `.java` files.
- **C Compiler**: GCC or any standard C compiler is required to compile the `.c` files.

### Running the Programs
1. Clone the repository:
   ```bash
   git clone https://github.com/muralimallela/CNS_Lab.git .
   ```
2. Navigate to the directory:
   ```bash
   cd CNS_Lab
   ```
3. Compile and run the required program:
   - For Java programs:
     ```bash
     javac <filename>.java
     java <filename>
     ```
   - For C programs:
     ```bash
     gcc <filename>.c -o <output_name>
     ./<output_name>
     ```

## Contributing
If you would like to contribute to this repository, feel free to fork the project and submit a pull request.

## License
This repository is open-source and available under the [MIT License](LICENSE).

---
Happy coding!

