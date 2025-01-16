#include <stdio.h>
#include <stdlib.h>

int main() 
{
    int u[20], a[20], b[20], n, i, j, item, flag=0,sizeA,sizeB;
// Input the universal set
    printf("Enter the size of the universal set: ");
    scanf("%d", &n);
    printf("Enter the elements of the universal set:\n");
    for (i = 0; i < n; i++)
     {
        scanf("%d", &u[i]);
    }
// Initialize Set A and Set B arrays
    for (i = 0; i < n; i++) {
        a[i] = 0;  
        b[i] = 0; 
    }
    // Input Set A
    printf("Enter the size of set A: ");
    scanf("%d", &sizeA);
    printf("Enter the elements of Set A:\n");
    for (i = 0; i < sizeA; i++) {
        scanf("%d", &item);
// Check if the item exists in the universal set
         flag=0;
         for (j = 0; j < n; j++) {
            if (u[j] == item) {
               // a[j]=1;
                flag = 1;
                break;
            }
        }
// Update Set A
        if (flag) {
            a[i] = 1;
        } else {
            a[i] = 0;
        }
    }
// Input Set B
    printf("Enter the size of set B: ");
    scanf("%d", &sizeB);
    printf("Enter the elements of Set B:\n");
    for (i = 0; i < sizeB; i++) {
        scanf("%d", &item);
// Check if the item exists in the universal set
        flag=0;
        for (j = 0; j < n; j++) {
            if (u[j] == item) {
                //b[j]=1;
                flag= 1;
                break;
            }
        }
  // Update Set B
        if (flag) {
            b[i] = 1;
        } else {
            b[i] = 0;
        }
    }
// Display Universal Set
    printf("\nUniversal Set: ");
    for (i = 0; i < n; i++) {
        printf("%d \t", u[i]);
    }
// Display Set A
    printf("\nSet A: ");
    for (i = 0; i <n; i++) {
        printf("%d \t", a[i]);
    }
// Display Set B
    printf("\nSet B: ");
    for (i = 0; i < n; i++)
     {
        printf("%d \t", b[i]);
    }
//Display set A union Set B
    printf("\n  Set aub: ");
    for (i = 0; i < n; i++) 
    {
      printf("%d \t", a[i]||b[i]);
    }
//Display set A intersection Set B
    printf("\n  Set anb: ");
    for (i = 0; i < n; i++)
     {
       printf("%d \t", a[i]&&b[i]);
    }
//Display set A difference Set B
    printf("\nSet a-b:  ");
    for(i=0;i<n;i++)
    {
        printf("%d \t",a[i]&& !b[i]);
    }
//Display set B difference Set A
     printf("\nSet b-a:  ");
    for(i=0;i<n;i++)
    {
        printf("%d \t",b[i]&& !a[i]);
    }

return 0;
}