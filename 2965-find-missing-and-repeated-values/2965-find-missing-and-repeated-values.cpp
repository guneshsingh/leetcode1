class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        
        int miss=-1,dou=-1;
        for(int i=1;i<=grid.size()*grid.size();i++){
            int count=0;
            for(int j=0;j<grid.size();j++){
                for(int k=0;k<grid.size();k++)
                    {if(grid[j][k]==i)
                        {count++;}
                    
            }}
            if(count==2) dou=i;
            else if(count==0) miss=i;
        }
        
        
        return {dou,miss};
    }
};