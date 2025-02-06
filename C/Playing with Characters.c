#include <stdio.h>
#include <string.h>

int main() 
{  
     char ch, s[100],sen[100]; //
    printf("Enter the Input:");

    scanf("%c\n",&ch);
    scanf("%s\n",&s);
    scanf("%[^\n]%*c",&sen);

    printf("%c\n%s\n%s",ch,s,sen);

    return 0;
}
// Note: The statement: scanf("%[^\n]%*c", s); 
// will not work because the last statement will read a newline character, 
// \n, from the previous line. This can be handled in a variety of ways. 
// One way is to use scanf("\n"); before the last statement.