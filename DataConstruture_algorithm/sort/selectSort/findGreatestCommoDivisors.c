#include <stdio.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

int findGreatestCommoDivisors(int first, int second)
{
    int max = 0;
    int temp = 1;
    for (int i = 1; i <= second; i++)
    {
        if (first % i == 0 && second % i == 0)
        {
            temp = i;
            if (max < temp)
            {
                max = temp;
            }
        }
    }
    return max;
}
// void insertCommonDivisors(struct ListNode *head, int temp)
// {
//     // struct ListNode *note = (struct ListNode *)malloc(sizeof(struct ListNode));
//     note->val = temp;
//     note->next = head->next;
//     head->next = note;
// }

int main()
{
    // struct ListNode *head = (struct ListNode *)malloc(sizeof(struct ListNode));
    // head->next = NULL;
    int temp = findGreatestCommoDivisors(12, 15);
    printf("%d\n", temp);
    // while (head->next != NULL)
    // {
    //     int temp = findGreatestCommoDivisors(head->val, head->next->val);
    //     insertCommonDivisors(head, temp); // 做 n-1 次
    //     head = head->next;
    // }

    return 0;
}
//  int findGreatestCommoDivisors(struct ListNode* first,struct ListNode* second){

//  }
// struct ListNode* insertGreatestCommonDivisors(struct ListNode* head) {
//     //temp =(listN.val list.next.val)
//     //n = malloc-
//     //n.next = lis.next
//     //list = n
// }