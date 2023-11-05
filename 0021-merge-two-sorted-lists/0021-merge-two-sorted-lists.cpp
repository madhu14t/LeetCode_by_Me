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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* result=new ListNode();
        ListNode* cur=result;
        if (!list1) return list2;
        if (!list2) return list1;
        while(list1 !=NULL && list2 !=NULL){
            if(list1->val < list2->val){
                cur->next=list1;
                list1=list1->next;
            }
            else{
                cur->next=list2;
                list2=list2->next;
            }
            cur=cur->next;
            if(list1!=NULL){
                cur->next=list1;
            }
            else{
                cur->next=list2;
            }
        }
        return result->next;
    }
};