//1) 
count = 18410

//2)
public void mirrorSnowman()
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    //right arm 
    for (int row = 167; row < 200; row++)
    {
      for (int col = 238; col < 300; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row + 78][col+7];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    //for left arm
    for (int row = 156; row < 198; row++)
    {
      for (int col = 102; col < 169; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row + 80][col-6];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

//3)
public void mirrorGull()
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 236; row < 324; row++)
    {
      for (int col = 230; col < 350; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row + 17][col + 150];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
