
#include	<stdio.h>
#include	<malloc.h>
#include	<string.h>
#include	"SGList.h"


aSGList* Insert(SG*  pSG,aSGList* bucket[])
	{
	int hValue = transform(pSG->name);
	aSGList* newNode;
	aSGList* trail=NULL;
	aSGList* lead = bucket[hValue];
	for(; lead; trail = lead, lead = lead->next)

		if(!strcmp(lead->aSG->name,pSG->name))
		{

			return NULL;
		}

	newNode = (aSGList*) malloc(sizeof(aSGList));
	newNode->next = bucket[hValue];
	bucket[hValue] = newNode;
	bucket[hValue]->aSG = pSG;
	return bucket[hValue];
	}

void Delete(aSGList* pSGNode, aSGList* bucket[])
	{
	int hValue = transform(pSGNode->aSG->name);
	aSGList* lead = bucket[hValue];

	if(pSGNode == bucket[hValue])
		bucket[hValue] = bucket[hValue]->next;

	else
		{
		while(lead->next != pSGNode)
			lead = lead->next;
		lead->next = pSGNode->next;
		}
	free(pSGNode->aSG);
	free(pSGNode);

	}


aSGList* Search( char*  SGName, aSGList* bucket[])
	{
	int hValue = transform(SGName);
	aSGList* lead = bucket[hValue];
	while(lead != NULL)
	{
		if(strcmp(lead->aSG->name, SGName) == 0)
			break;
		lead = lead->next;
	}

	return lead;
	}

int transform(char *name)
{
	int hash = 0;
	while(*name != '\0')
	{
		hash += *name++;

	}
	hash = (hash % TABLE_SIZE);
	return hash;
}

void InitTable(aSGList* hashTable[], int size)
{
	int index;
	for(index = 0; index < size; index++)
		hashTable[index] = NULL;
}
