class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int dist = -1;
        int temp = 10000,a,b,c;
        for(int count = 0; count<points.length; ++count)
        {
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
        }
        return dist;
    }
}