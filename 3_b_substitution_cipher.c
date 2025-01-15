#include<stdio.h>
#include<string.h>
void main()
{
int len,i,j,key;
char alpha[]=”abcdefghijklmnopqrstuvwxyz”;
char keyis[]=”defghijklmnopqrstuvwxyzabc”;
char pt[10],ct[10],npt[10];
printf(“enter the plain text\n”);
scanf(“%s”,pt);
printf(“Encryption is as follows\n”);
len=strlen(pt);
for(i=0;i<len;i++)
{
for(j=0;j<26;j++)
{
if(pt[i]==alpha[j])
{
ct[i]=keyis[j];
}
}
}
printf(“Cipher Text is %s\n”,ct);
printf(“Decryption is as follows\n”);
for(i=0;i<len;i++)
{
for(j=0;j<26;j++)
{
if(ct[i]==keyis[j])
{
npt[i]=alpha[j];
}
}
}
printf(“Decrypted Text is %s”,npt);
}