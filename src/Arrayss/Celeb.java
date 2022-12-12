package Arrayss;

public class Celeb {
        //Function to find if there is a celebrity in the party or not.
        int celebrity(int M[][], int n)
        {
                int celeb = -1;
                for(int i=0;i<M.length;i++){
                        for(int j=0;j<M[0].length;j++){
                                if(M[i][j]==1) {
                                        celeb = j;
                                        if(!checkCeleb(celeb, M))
                                                celeb=-1;
                                        else
                                                return celeb;
                                }
                        }
                }
                return celeb;
        }

        public boolean checkCeleb(int cel,int M[][]){
                for(int k=0;k<M.length;k++){
                                if(k!=cel && M[k][cel]!=1)
                                        return false;
                }
                for(int l=0;l<M[0].length;l++) {
                        if (M[cel][l] != 0)
                                return false;
                }
                return true;
        }

        public static void main(String[] args){
             int[][] in = new int[][]{{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}};
             System.out.println(new Celeb().celebrity(in,18));
        }
}
