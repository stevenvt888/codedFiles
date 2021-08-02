#include	<stdio.h>
#include	<malloc.h>
#include	<string.h>
#include	"LSList.h"

aLSList* GetFirstNode() 
	{	
	return head;		
	}

	void
Insert(ls*  pLS)	
	{	 
	aLSList* newLSNode;
	
	newLSNode = ( aLSList *) malloc(sizeof (aLSList) );	
	newLSNode->aLS = pLS;
	
	newLSNode->next = head;	
	head = newLSNode;	
	}

void
Delete(aLSList* pLSNode)	
{	  
	if(pLSNode == head)
        head = pLSNode->next;	    
	else		
	{
		currentNode = GetFirstNode();	
		
		while	((currentNode != NULL) && (currentNode->next != pLSNode))
			currentNode = currentNode->next;
        currentNode->next = currentNode->next->next;		
	}	
	free(pLSNode->aLS);    
	free(pLSNode);	
}

aLSList* Search( char * cdName)	
{
	currentNode= head;
	while(currentNode != NULL)		
	{	
		if(strcmp(currentNode->aLS->name, cdName) == 0 )			
			return currentNode;
		currentNode = currentNode->next; 		
	}		
	return NULL;
}

void
Print()	
{	
	int total = 0;	
	currentNode = head;	
	if(currentNode == NULL)
		return;	
	while(currentNode  != NULL)		
	{		
		printf("%s\n%s\n%.2f\n%d\n\n", currentNode->aLS->name, currentNode->aLS->artName
									, currentNode->aLS->price,currentNode->aLS->amount);		
		getchar();
	
		total = total + currentNode->aLS->amount;		
		
		currentNode = currentNode->next;		
	}		
		printf("The total inventories are: %d\n", total);	
}

unsigned
NumRecords()	
{
	unsigned numRecs = 0;	
	currentNode = head;	
	while(currentNode != NULL)	
	{
		currentNode = currentNode->next;		
		numRecs++;	
	}	
	return numRecs;	
}

void
Sort()
{
	void Quicksort(aLSList* list[], int left, int right);	
	aLSList** arrNode;
	int count;	
	int index;	
	count = NumRecords();
	
	arrNode = malloc(count * sizeof(aLSList*));	

	currentNode = head;
	for(index = 0 ; currentNode != NULL; index++)	
	{		
		arrNode[index] = currentNode;
		currentNode = currentNode->next;	
	}
	
	Quicksort(arrNode, 0 , count - 1);
	free(arrNode);
}

void
Quicksort(aLSList* list[], int left, int right)
{
	void Swap(aLSList* lNode, aLSList* rNode);	
	int i , j;	
	char* pivot;
	if(left < right)	
	{		
		i = left;		
		j = right + 1;		
		pivot = list[left]->aLS->name;
		do		
		{				
			do			
			{				
				i++;
			}while(( i <= right) && (strcmp(list[i]->aLS->name, pivot ) < 0));			
			do			
			{
				j--;			
			}while(( j >= left) && (strcmp(list[j]->aLS->name, pivot ) > 0));
			if(i < j)			
			{				
				Swap(list[i], list[j]);			
			}		
		}while(i < j);
		Swap(list[left], list[j]);		
		Quicksort(list, left, j-1);
		Quicksort(list, j+1, right);	
	}
}

void Swap(aLSList* lNode, aLSList* rNode) 
{
	ls* temp;	
	temp       = lNode->aLS;	
	lNode->aLS  = rNode->aLS;	
	rNode->aLS = temp;
}