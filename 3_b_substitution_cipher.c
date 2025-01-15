#include<stdio.h>
#include<string.h>

void main() {
    int len, i, j;
    char alpha[] = "abcdefghijklmnopqrstuvwxyz";
    char keyis[] = "defghijklmnopqrstuvwxyzabc";
    char pt[100], ct[100], npt[100];

    printf("Enter the plain text: ");
    scanf("%s", pt);

    printf("Encryption is as follows\n");
    len = strlen(pt);

    // Initialize ct and npt arrays to avoid garbage values
    memset(ct, 0, sizeof(ct));
    memset(npt, 0, sizeof(npt));

    for (i = 0; i < len; i++) {
        for (j = 0; j < 26; j++) {
            if (pt[i] == alpha[j]) {
                ct[i] = keyis[j];
                break; // Exit loop once match is found
            }
        }
    }

    printf("Cipher Text is %s\n", ct);

    printf("Decryption is as follows\n");
    for (i = 0; i < len; i++) {
        for (j = 0; j < 26; j++) {
            if (ct[i] == keyis[j]) {
                npt[i] = alpha[j];
                break; // Exit loop once match is found
            }
        }
    }

    printf("Decrypted Text is %s", npt);
}
