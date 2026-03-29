class Solution {
public:
    bool isValid(string s) {
        int balance = 0;
        for(char c : s) {
            if(c == '(') balance++;
            else balance--;

            if(balance < 0) return false;
        }
        return balance == 0;
    }

    void generate(int n, string curr, vector<string>& result) {
        if(curr.size() == 2*n) {
            if(isValid(curr))
                result.push_back(curr);
            return;
        }

        generate(n, curr + '(', result);
        generate(n, curr + ')', result);
    }

    vector<string> generateParenthesis(int n) {
        vector<string> result;
        generate(n, "", result);
        return result;
    }
};