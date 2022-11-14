#include<bits/stdc++.h>
using namespace std;


class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {

        vector<int> temp;

        for (int i = 0; i < nums.size(); i++)
        {
            for (int j = 1; j < nums.size(); j++)
            {
                if (i !=j  && nums[i] + nums[j] == target)
                {
                    temp.push_back(i);
                    temp.push_back(j);
                    return temp;
                }
            }
        }
     return temp;   
        
    }
};