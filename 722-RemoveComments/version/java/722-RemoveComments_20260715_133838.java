// Last updated: 15/07/2026, 13:38:38
1class Solution {
2    public List<String> removeComments(String[] source) {
3        boolean blockActive = false;
4        List<String> result = new ArrayList<String>();
5        StringBuilder builder = new StringBuilder();
6        for(String line: source){
7            if(!blockActive){ 
8                builder = new StringBuilder();
9            }
10            for(int i=0; i<line.length(); i++){ 
11                char c = line.charAt(i);
12                if(!blockActive){ 
13                    if(c=='/'){ 
14                        if(i<line.length()-1 && line.charAt(i+1)=='/'){
15                            break; 
16                        } else if(i<line.length()-1 && line.charAt(i+1)=='*'){ 
17                            i++; 
18                            blockActive = true;
19                        } else{
20                            builder.append(c);
21                        }
22                    } else  { 
23                        builder.append(c);
24                    }
25                } else { 
26                    if(c=='*'){
27                        if(i<line.length()-1 && line.charAt(i+1)=='/'){
28                              blockActive = false;  
29                              i++;
30                        }
31                    }
32                } 
33            }
34            if(!blockActive && builder.length()!=0){
35                result.add(builder.toString());
36            }
37        }
38        return result;
39    }
40}