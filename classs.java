struct node
{
    int value;
    struct node* left;
    struct node* right;
};


struct node *mirrorTree(struct node *root)
{
  struct node *temp;
  
  if(root==NULL)
    return(NULL);
   
  temp = (struct node *) malloc(sizeof(struct node));
  temp->value = root->value;

  temp->left  = mirrorTree(root->right);
  temp->right = mirrorTree(root->left);

  return(temp);
}