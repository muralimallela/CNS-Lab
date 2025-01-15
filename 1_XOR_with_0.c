#include<stdl ib.>
void main()
{
char str[]="Hello World";
char str1[11];
int i,len;
len=strl en(str);
for(i=0;i<len;i++
)
{
str1[i]=str[i]^0;
printf("%c",str1[i]);
}
printf("\n");
}