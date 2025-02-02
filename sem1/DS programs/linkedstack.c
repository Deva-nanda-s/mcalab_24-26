#include <stdio.h>
#include <stdlib.h>
int count=0;
struct node
{
    int data;
    struct node *next;
};
struct node *top = 0, *newnode, *temp;

void push();
void pop();
void display();
void search();

int main()
{
    int ch;
    while (1)
    {
        printf("\n1.Push\n 2.Pop\n3.Display\n4.search\n5.Exit");
        printf("\nEnter the choice:");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            push();
            break;

        case 2:
            pop();
            break;

        case 3:
            display();
            break;
        
         case 4:
            search();

        case 5:
            exit(0);
        }
    }
}

void push()
{
    int item;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the Data:");
    scanf("%d", &item);
    newnode->data = item;
    newnode->next = top;
    top = newnode;
    count++;
}

void display()
{
    temp = top;
    if (top == 0)
    {
        printf("List is empty");
    }
    else
    {
        while (temp != 0)
        {
            printf("%d\t", temp->data);
            temp = temp->next;
        }
    }
    printf("Count is:%d",count);
}

void pop()
{
    temp = top;
    if (top == 0)
    {
        printf("The List Is Empty");
    }
    else
    {
        printf("%d is deleted", top->data);
        top = top->next;
        free(temp);
    }
    count--;
}

void search()
{
    temp=top;
    int i=1,item,flag=0;
    printf("ENter element to search");
    scanf("%d",&item);
    if (top == 0)
    {
        printf("List is empty");
    }
    else{
        while(temp!=NULL){
            if(item==temp->data)
            {
                flag=1;
               printf("%d",i);
             
            }
             temp=temp->next;
            i++;
        }
    }
    if(flag==0){
        printf("not Found at position");
    }
}