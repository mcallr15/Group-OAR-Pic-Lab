//1)
 public int getCount(int number){
      int count = 0;
      for(int col = 0; col < matrix[0].length; col++){
          for(int row = 0; row < matrix.length; row++){
              if(number == matrix[row][col]){
                  count++;
              }
          }
      }
      return count;
  }

//2)
 public int getLargest(){
      int max = matrix[0][0];
      for(int col = 0; col < matrix[0].length; col++){
          for(int row = 0; row < matrix.length; row++){
              if(max < matrix[row][col]){
                  max = matrix[row][col];
              }
          }
      }
      return max;
   }

//3)
public int getColTotal(int col){
      int total = 0;
        for(int row = 0; row < matrix.length; row++){
              total = total + matrix[row][col];
              
        }
      return total;
  }
