package chess;

import java.util.HashMap;

class Horse{
    public int x,y;
    Horse(int x, int y){
        this.x=x;
        this.y=y;        
    }
    
    public HashMap M(){
        HashMap map = new HashMap<String, Character>();           
        int N=G1(x,y, map)+G2(x,y, map)+G3(x,y, map)+G4(x,y, map)+G5(x,y, map)+G6(x,y, map)+G7(x,y, map)+G8(x,y, map);                        
        return map;
    }
    
    private int G1(int x, int y, HashMap map){
        int N=0;        
        if(x>=8||y>=7) return 0;
        else {                
            x++;                
            y+=2;
            N++;
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h');
        }                       
        return N;
    }
    
    private int G2(int x, int y, HashMap map){
        int N=0;
        if(x>=7||y>=8) return 0;
        else {                
            x+=2;                
            y++;
            N++;
            
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h');
        }                
        return N;
    }
    
    private int G3(int x, int y, HashMap map){
        int N=0;
        if(x>=7||y<=1) return 0;
        else {                
            x+=2;                
            y--;
            N++;
            
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h');
        }                            
        return N;
    }
    
    private int G4(int x, int y, HashMap map){
        int N=0;
        if(x>=8||y<=2) return 0;
        else {                
            x++;                
            y-=2;
            N++;
            
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h');
        }                
        return N;
    }
    
    private int G5(int x, int y, HashMap map){
        int N=0;
        if(x<=1||y<=2) return 0;
        else {                
            x--;                
            y-=2;
            N++;
            
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h');
        }                
        return N;
    }    
    
    private int G6(int x, int y, HashMap map){
        int N=0;
        if(x<=2||y<=1) return 0;
        else {                
            x-=2;                
            y--;
            N++;
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h');
        }                
        return N;
    }
    
    private int G7(int x, int y, HashMap map){
        int N=0;
        if(x<=2||y>=8) return 0;
        else {                
            x-=2;                
            y++;
            N++;
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h'); 
        }                              
        return N;
    }
    
    private int G8(int x, int y, HashMap map){
        int N=0;
        if(x<=1||y>=7) return 0;
        else {                
            x--;                
            y+=2;
            N++;
            char xChar='0';        
            switch(x){
                case 1: xChar='A';
                case 2: xChar='B';
                case 3: xChar='C';
                case 4: xChar='D';
                case 5: xChar='E';
                case 6: xChar='F';
                case 7: xChar='G';
                case 8: xChar='H';
            }
            map.put(xChar+""+y, 'h');
        }                
        return N;
    }
      
}
