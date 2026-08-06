class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        boolean[][] visited = new boolean[n][m];
        modifyArr(image,sr,sc,color,image[sr][sc],visited);
        return image;
    }
    public void modifyArr(int[][] image,int sr, int sc, int color, int originalColor, boolean[][] visited){
        //base case
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc] == true || image[sr][sc] != originalColor){
            return;
        }
        image[sr][sc] = color;
        visited[sr][sc] = true;
        //code
        modifyArr(image,sr+1,sc,color,originalColor,visited);
        modifyArr(image,sr-1,sc,color,originalColor,visited);
        modifyArr(image,sr,sc+1,color,originalColor,visited);
        modifyArr(image,sr,sc-1,color,originalColor,visited);
    }
}