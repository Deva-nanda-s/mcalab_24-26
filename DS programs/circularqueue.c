#include<stdio.h>
#include<stdlib.h>
#define N 5

 int front=-1 , rear=-1;
 int queue[N];
 int count=0;

void ins();
void del();
void dis();
void search();

void main()
{
    int ch;
    while(1)
    {
    printf("\n1.insertion\n2.deletion\n3.display\n4.Search\n5.exit\nEnter ur choice");
    scanf("%d",&ch);
    switch(ch){
        case 1:ins();
               break;
        case 2:del();
               break;
        case 3:dis();
               break;
        case 4:search();
               break;
        case 5:exit(0);
        default:
        printf("Invalid\n");

    }
    }
}

  void ins()
  {
    int item;
     printf("Enter item to insert");
     scanf("%d",&item);
    if((rear+1)%N==front){
        printf("Overflow");
    }
    else if(front==-1&&rear==-1)
    {
      front=rear=0;
      queue[rear]=item;
      count++;
    }
    else
    {
        rear=(rear+1)%N;
        queue[rear]=item;
        count++;
    }
  }


    void del(){
          if((front+1)%N==rear){
            printf("empty");
          }
          else if(front==rear){
            front=-1;
            rear=-1;
            count--;
          }
          else
          {
          front=(front+1)%N;
          count--;
          }

    }
  void dis(){
    int i=front,item;
    if(front==-1&& rear==-1)
    {
        printf("empty");
    }
    else{
        printf("Queue is:");
        while(i!=rear)
        {
         printf("%d\t",queue[i]);
         i=(i+1)%N;
        }
         printf("%d\t",queue[i]);
    }
    printf("\nCount is:%d\n",count);
    
  }

  void search()
  {
    int i=front,item,flag=0;
    printf("Enter item to search");
    scanf("%d",&item);
    for(i=front+1;i!=(rear+1)%N;i=(i+1)%N)
    {
      if(item==queue[i])
      {
        flag=1;
        printf("\n%d found at position:%d\n",item,i);
      }
    }
    if(flag==0)
    {
            printf("Item not found");
    }
   
       
      }
    