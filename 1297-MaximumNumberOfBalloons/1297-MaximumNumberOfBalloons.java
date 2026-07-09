// Last updated: 09/07/2026, 09:47:53
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,n=0,o=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='b')
            {
                b++;
            }
            else if(ch =='a'){
                a++;
            }
            else if(ch=='l'){
                l++;
            }
            else if(ch=='o'){
                o++;
            }
            else if(ch=='n'){
                n++;
            }

        }
        l=l/2;
        o=o/2;
        return Math.min(Math.min(Math.min(a,b),Math.min(l,o)),n);
    }
}