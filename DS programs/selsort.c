#include<stdio.h>
#include<conio.h>
int main(void)
{
  int a[10],n,i,j,small,temp;
  printf("Enter limit");
  scanf("%d",&n);
  printf("Enter elements of array");
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    small=i;
    for(j=i+1;j<n;j++)
    {
        if(a[j]<a[small])
        {
            small=j;
        }
    }
            temp=a[small];
            a[small]=a[i];
            a[i]=temp;
  }
    printf("Sorted array\n");
      for(i=0;i<n;i++)
      {
          printf("%d\n",a[i]);
      }
return 0;
  }
