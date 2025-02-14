#include <stdio.h>

int main()
{
    int item,n,a[20],loc=0,i;
    printf("Enter the limit:");
    scanf("%d",&n);
    printf("Enter the Element:");
    for(i=0;i<n;i++)
     {
       scanf("%d",&a[i]);
       
     }
    printf("Enter the item to be searched:");
    scanf("%d",&item);
    for(i=0;i<n;i++)
      {
          if(item==a[i])
            {
                loc=i;
                break;
            }
      }
      if(loc!=0)
        {
            printf("item found at the location:%d",loc);
        }
    else
      {
          printf("item not found");
      }
    
}