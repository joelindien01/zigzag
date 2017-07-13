public class Solution {
    public String convert(String s, int numRows) {
        
        String toReturn="";
        List<String> strings = new ArrayList();        
        
        for(int i=0;i<numRows;i++){            
            List<Integer> ranges = getContainers(i,s.length(),numRows);
            System.out.println(ranges);
           for(Integer range : ranges ){
               toReturn=toReturn+s.charAt(range)+"";
           }
        }
        
        return toReturn;
        
    }
    
    public List<Integer> getContainers(Integer first,Integer last,Integer rows){
        System.out.println("last="+last);
        List<Integer> toReturn = new ArrayList();
        while(first<last){
            int k =0;
            if(first%2==0){
                if(first%4==0){
                   k=rows+1;
                    toReturn.add(first); 
                }
            }else{
                if((first-1)%3==0){
                    k=rows-1;
                toReturn.add(first);
                }
            }
            first = first + k;
        }
        return toReturn;
    }
}
