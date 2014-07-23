class List
{	
     private:
	 int data ; //Information part of linked list
     	List *next ; // Pointer to next node	
     public:
	 List() // Default Constructor
     	{    this->next = NULL;     }
    	 void displayData() // Method to display the elements of the linked list
    	 {
		List *start = this->next ;
		while(start!= NULL)
		{
			cout << "  "  << start->data;
			start=start->next ;
		}
      	}
void enterData()  // Method to enter the data in the linked list
 {
	int d ;
	cout << "\n Enter the data: ";
	cin >> d ;
	List *start = this;
	List *node = new List ;
	node->data = d ;
	node->next = NULL ;
	while(start->next != NULL)
		start = start->next ;
	start->next = node ;
 } 
void sort()   // Method to sort the linked list
{
	List *start = this ;
	int temp ;
	for(List*  i = start; i->next != NULL; i = i->next)
	{
		for(List*  j = i->next; j!=NULL; j = j->next)
		{
			if(i->data > j->data)
			{
				temp = i->data;
				i->data = j->data ;	
				j->data = temp ;
			}
		}
	}
}	
void reverse() // Method to reverse a Linked list
{
	List  *current = this->next ;
	List  *prev = NULL;
	List  *save = NULL;
	while(current != NULL)
	{
		save = current->next ;
		current->next = prev ;
		prev = current ;
		current = save ;
	}
	this->next = prev ;
}
     void main()
     {
	List  l  ;
	char ch= 'y' ;
	while(1)
	{
		l.enterData();
		cout << "\n Enter more y or n: ";
		cin >> ch ;
		cin.get();
		if(ch != 'y')
			break;
	}
	l.sort();
	l.displayData();
	l.reverse();
	l.displayData();
     } 

