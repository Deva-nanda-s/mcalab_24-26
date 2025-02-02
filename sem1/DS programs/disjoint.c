#include <stdio.h>
#include <stdlib.h>

int setA[10], setB[10], setC[20], m, n, unionSize = 0, unionPerformed = 0;

void create();
void unionset();
void find();
void disj();

int main() {
    int choice;
    while (1) {
        printf("\n1. Creation\n2. Union\n3. Find\n4.disjoint\n5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                create();
                break;
            case 2:
                unionset();
                break;
            case 3:
                find();
                break;
            case 4:disj();
                break;
            case 5:
                return 0;
            default:
                printf("\nInvalid choice\n");
        }
    }
    return 0;
}

void create() {
    printf("Enter the number of elements in Set A: ");
    scanf("%d", &m);
    printf("Enter elements of Set A:\n");
    for (int i = 1; i <= m; i++) {
        scanf("%d", &setA[i]);
    }

    printf("Enter the number of elements in Set B: ");
    scanf("%d", &n);
    printf("Enter elements of Set B:\n");
    for (int i = 1; i <= n; i++) {
        scanf("%d", &setB[i]);
    }

    printf("\nSet A: {");
    for (int i = 1; i <= m; i++) {
        printf("%d", setA[i]);
        if (i < m) printf(", ");
    }
    printf("}\n");

    printf("Set B: {");
    for (int i = 1; i <= n; i++) {
        printf("%d", setB[i]);
        if (i < n) printf(", ");
    }
    printf("}\n");
  
    
}

void unionset() {
    int j = 1;  // Index for union set

    // Copy elements from Set A to Union Set
    for (int i = 1; i <= m; i++) {
        setC[j] = setA[i];
        j++;
    }

    // Add unique elements from Set B to Union Set
    for (int i = 1; i <= n; i++) {
        int dup = 0;
        for (int k = 1; k < j; k++) {
            if (setB[i] == setC[k]) {
                dup = 1;  // Duplicate found
                break;
            }
        }
        if (!dup) {
            setC[j] = setB[i];
            j++;
        }
    }

    unionSize = j - 1;        // Update union size
    unionPerformed = 1;       // Mark that union has been performed

    // Print the Union Set
    printf("\nUnion Set: {");
    for (int i = 1; i <= unionSize; i++) {
        printf("%d", setC[i]);
        if (i < unionSize) printf(", ");
    }
    printf("}\n");
}

void find() {
    int item, found = 0;
    printf("Enter the element to find: ");
    scanf("%d", &item);

    if (unionPerformed) {
        // If union has been performed, search in the union set
        for (int i = 1; i <= unionSize; i++) {
            if (item == setC[i]) {
                printf("\nParent is: %d (from Union Set)\n", setC[1]);
                found = 1;
                return;
            }
        }
    } 
    else if(!unionPerformed)
     {
        // If union has not been performed and if same elements in A and B ,search in Set A and B
     for(int i=1;i<=m;i++){
       for(int j=1;j<=n;j++){ 
        if(item==setA[i]==setB[j]){
            printf("\nParent is: %d (from Set A)\n",setA[1]);
            printf("Parent is: %d (from Set B)\n",setB[1]);
            found = 1;
            return;
        }}}}
    else{ 
        // If union has not been performed, search in Set A
        for (int i = 1; i <= m; i++) {
            if (item == setA[i]) {
                printf("\nParent is: %d (from Set A)\n", setA[1]);
                found = 1;
                return;
            }
        }

        // Search in Set B
        for (int i = 1; i <= n; i++) {
            if (item == setB[i]) {
                printf("\nParent is: %d (from Set B)\n", setB[1]);
                found = 1;
                return;
            }
        }
    }
     
    // Element not found in any set
    if (!found) {
        printf("\nNo such element is found in the set.\n");
    }
}
void disj(){ 
    int f=0;
    for(int i=1;i<=m;i++){
       for(int j=1;j<=n;j++){ 
        if(setA[i]==setB[j]){
          f=1;
          break;
    }
   } 
    }
    if(f==1){
        printf("not disjoint");
    }
    else{
       printf(" Disjoint");
    }
}
 