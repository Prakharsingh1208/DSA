class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){ return s;}
        List<List<String>> row = new ArrayList<>();
        int r = numRows;
        while(r!=0){
            row.add(new ArrayList<String>());
            r--;
        }

        boolean con = true;
        int rowCount=0;
        for(int i=0;i<s.length();i++){
            if(con){
                row.get(rowCount).add(Character.toString(s.charAt(i)));
                if(rowCount==numRows-1){
                    con=false;
                    rowCount = rowCount-1;
                }else{
                    rowCount++;
                }
                continue;
            }
            else if(!con){
                row.get(rowCount).add(Character.toString(s.charAt(i)));
                if(rowCount==0){
                    con=true;
                    rowCount=1;
                }else{
                    rowCount--;
                }

            }
        }

        StringBuilder result = new StringBuilder();  

        for (int i = 0; i < row.size(); i++) {
            for (int j = 0; j < row.get(i).size(); j++) {
                result.append(row.get(i).get(j));   
            }
        }

        return result.toString();
        
    }
}