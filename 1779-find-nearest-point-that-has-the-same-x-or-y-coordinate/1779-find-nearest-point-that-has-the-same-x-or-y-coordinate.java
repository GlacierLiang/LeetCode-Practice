class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int dist = -1;
        int temp = 10000,a,b,c;
        int count = 0; 
        do{
            a = points[count][0];
            b = points[count][1];
            if(a==x || b==y)
            {
                c = Math.abs(a-x)+Math.abs(b-y);
                if(c<temp)
                {
                    temp = c;
                    dist = count;
                }
            }
            count++;
        }while(count<points.length);
            return dist;
    }
}