/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
          ListNode *head,*prev;
        int carry=0;
        bool carryh=false;
        while(l1!=NULL && l2!=NULL)
        {           
            int sum=(l1->val) + (l2->val)+carry;
            carry=sum/10;
            sum=sum%10;                
            //ListNode* carryur=new ListNode(sum);
            l1->val=sum;
            if(carryh==false)
            {
                carryh=true;              
                head=l1;
                prev=l1;
            }
            else
            {
                prev->next=l1;
                prev=l1;
            }
            l1=l1->next;
            l2=l2->next;
        }
        if(l1!=NULL)
        {
            while(l1!=NULL)
            {
                int sum=(l1->val)+carry;
                carry=sum/10;
                sum=sum%10;                
                //ListNode* carryur=new ListNode(sum);
                l1->val=sum;
                prev->next=l1;
                prev=l1;
                l1=l1->next;
            }
            if(carry!=0)
            {
                ListNode* carryur=new ListNode(carry);
                prev->next=carryur;
            }
        }
        else
        {
            while(l2!=NULL)
            {
                int sum=(l2->val)+carry;
                carry=sum/10;
                sum=sum%10;                
                //ListNode* carryur=new ListNode(sum);
                l2->val=sum;
                prev->next=l2;
                prev=l2;
                l2=l2->next;
            }
            if(carry!=0)
            {
                ListNode* carryur=new ListNode(carry);
                prev->next=carryur;
            }
        }
        return head;
    }  
};