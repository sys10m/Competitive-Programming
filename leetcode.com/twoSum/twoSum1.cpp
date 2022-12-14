class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        //  brute force (nested linear) => O(N^2)
        vector<int> toReturn;
        for (int i = 0; i < nums.size() - 1; i++){
            for (int j = i + 1; j < nums.size(); j++){
                if (nums.at(i) + nums.at(j) == target){
                    toReturn.push_back(i);
                    toReturn.push_back(j);
                }
            }
        }
        return toReturn;
    }
};
