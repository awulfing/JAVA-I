package halloweenlab;
public class HalloweenLab {
    char field[][] = {{'#','#','#','#','#','#','#','#','#','#','#','#'},
                      {'#','.','.','.','#','.','.','.','.','.','.','#'},
                      {'.','.','#','.','#','.','#','#','#','#','.','#'},
                      {'#','#','#','.','#','.','.','.','.','#','.','#'},
                      {'#','.','.','.','.','#','#','#','.','#','.','#'},
                      {'#','#','#','#','.','#','F','#','.','#','.','#'},
                      {'#','.','.','#','.','#','.','#','.','#','.','#'},
                      {'#','#','.','#','.','#','.','#','.','#','.','#'},
                      {'#','.','.','.','.','.','.','.','.','#','.','#'},
                      {'#','#','#','#','#','#','.','#','#','#','.','#'},
                      {'#','.','.','.','.','.','.','#','.','.','.','#'},
                      {'#','#','#','#','#','#','#','#','#','#','#','#'}};
    public void maze() {
        field[2][0] = 'O';
        int x = 2;
        int y = 0;
        char direction = 'E';
        print();
        field[x][y] = 'X';
        y++;//move forward
        field[x][y] = 'O';
        System.out.println("");
        print();
        rightHand(direction, x, y );
        
    }
    public boolean rightHand(char point, int x, int y){
        System.out.println(point);
        ////////////////////////////////////////////////////////////////////////
        if(point == 'N'){//if poitning north
            if(field[x-1][y] == 'F'){//if forward is finish
                field[x][y]='X';
                field[x-1][y]='O';
                print();
                System.out.println("");
                System.out.println("");
                System.out.println("DONEEEEEEEEEEEEEEE");
                return true;//end method
            }
            else if(field[x+1][y+1] == '#'&&(field[x][y+1] == 'X'||field[x][y+1] == '.')){
                field[x][y] = 'X';//if bottom right bad and right good go right and look right
                y++;
                point = 'E';
                field[x][y] = 'O';
                print();
            }
            else if(field[x-1][y] == '.' || field[x-1][y] == 'X'){//if forward ok
                field[x][y] = 'X';
                x--;//move forward
                field[x][y] = 'O';
                System.out.println("");
                print();
                //System.out.println(point);
            }
            else if(field[x-1][y] == '#'){//if forward is blocked
                if(field[x][y+1] == '.' || field[x][y+1] == 'X'){//if right ok
                    point = 'E';//turn right
                }
                else if(field[x][y-1] == '.' || field[x][y-1] == 'X'){//if left ok
                    point = 'W';//turn left
                }
                else{
                    point = 'S';//else turn around
                }
            }
            rightHand(point,x,y);//call method again
        }
        ////////////////////////////////////////////////////////////////////////
        else if(point == 'S'){//if pointing south
            if(field[x+1][y] == 'F'){//if forward is finish
                return true;//end method
            }
            else if(field[x-1][y-1] == '#'&&(field[x][y-1] == 'X'||field[x][y-1] == '.')){
                field[x][y] = 'X';
                y--;//if bottom right bad and right good go right and look right
                point = 'W';
                field[x][y] = 'O';
                print();
            }
            else if(field[x+1][y] == '.' || field[x+1][y] == 'X'){//if forward ok
                field[x][y] = 'X';
                x++;//move forward
                field[x][y] = 'O';
                System.out.println("");
                print();
                //System.out.println(point);
            }
            else if(field[x+1][y] == '#'){//if forward is blocked
                if(field[x][y-1] == '.' || field[x][y-1] == 'X'){//if right ok
                    point = 'W';//turn right
                }
                else if(field[x][y-1] == '.' || field[x][y-1] == 'X'){//if left ok
                    point = 'E';//turn left
                }
                else{
                    point = 'N';//else turn around
                }
            }
            rightHand(point,x,y);//call method again
        }
        ////////////////////////////////////////////////////////////////////////
        else if(point == 'E'){//if pointing East
            if(field[x][y+1] == 'F'){//if forward is finish
                return true;//end method
            }
            else if(field[x+1][y-1] == '#'&&(field[x+1][y] == 'X'||field[x+1][y] == '.')){
                field[x][y] = 'X';
                x++;//if bottom right bad and right good go right and look right
                point = 'S';
                field[x][y] = 'O';
                print();
            }
            else if(field[x][y+1] == '.' || field[x][y+1] == 'X'){//if forward ok
                field[x][y] = 'X';
                y++;//move forward
                field[x][y] = 'O';
                System.out.println("");
                print();
                //System.out.println(point);
            }
            else if(field[x][y+1] == '#'){//if forward is blocked
                if(field[x+1][y] == '.' || field[x+1][y] == 'X'){//if right ok
                    point = 'S';//turn right
                }
                else if(field[x-1][y] == '.' || field[x-1][y] == 'X'){//if left ok
                    point = 'N';//turn left
                }
                else{
                    point = 'W';//else turn around
                }
            }
            rightHand(point,x,y);//call method again
        }
        ////////////////////////////////////////////////////////////////////////
        else if(point == 'W'){// if pointing west
            if(field[x][y-1] == 'F'){//if forward is finish
                return true;//end method
            }
            else if(field[x-1][y+1] == '#'&&(field[x-1][y] == 'X'||field[x-1][y] == '.')){
                field[x][y] = 'X';
                x--;//if bottom right bad and right good go right and look right
                point = 'N';
                field[x][y] = 'O';
                print();
            }
            else if(field[x][y-1] == '.' || field[x][y-1] == 'X'){//if forward ok
                field[x][y] = 'X';
                y--;//move forward
                field[x][y] = 'O';
                System.out.println("");
                print();
                //System.out.println(point);
            }
            else if(field[x][y-1] == '#'){//if forward is blocked
                if(field[x-1][y] == '.' || field[x-1][y] == 'X'){//if right ok
                    point = 'N';//turn right
                }
                else if(field[x+1][y] == '.' || field[x+1][y] == 'X'){//if left ok
                    point = 'S';//turn left
                }
                else{
                    point = 'E';//else turn around
                }
            }
            System.out.println(point);
            rightHand(point,x,y);//call method again
        }
        ////////////////////////////////////////////////////////////////////////
        
        return false;
    }
    public void print(){
        for(int i = 0; i < 12; i++){
            System.out.println("");
            for(int j = 0; j < 12; j++){
                System.out.print(field[i][j]);
                System.out.print(" ");
            }    
        }
    }
    public static void main(String[] args) {
        
        
        
        
        HalloweenLab lab = new HalloweenLab();
        lab.maze();
    }
}