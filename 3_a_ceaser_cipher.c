#include <stdio.h>
#include <string.h>

void main() {
    int len, i, j, key, k;
    char alpha[] = "abcdefghijklmnopqrstuvwxyz";
    char pt[10], ct[10], npt[10];

    printf("Enter the plain text\n");
    scanf("%s", pt);

    printf("Enter the key\n");
    scanf("%d", &key);

    printf("Encryption is as follows\n");
    len = strlen(pt);
    for (i = 0; i < len; i++) {
        for (j = 0; j < 26; j++) {
            if (pt[i] == alpha[j]) {
                k = (j + key) % 26;
                ct[i] = alpha[k];
                break;
            }
        }
    }
    ct[len] = '\0';
    printf("Cipher Text is %s\n", ct);

    printf("Decryption is as follows\n");
    for (i = 0; i < len; i++) {
        for (j = 0; j < 26; j++) {
            if (ct[i] == alpha[j]) {
                k = (j - key) % 26;
                if (k < 0)
                    k = k + 26;
                npt[i] = alpha[k];
                break;
            }
        }
    }
    npt[len] = '\0';
    printf("Decrypted Text is %s", npt);
}
