//1)
public void copyParts(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < endRow && toRow < endRow; fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol;fromCol < endCol && toCol < endCol;fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

//2)
public void createMyCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    
    Picture flowerNoBlue = new Picture(flower1);
    flowerNoBlue.zeroBlue();
    Picture flowerNegate = new Picture(flower1);
    flowerNegate.negate();
    Picture flowerOnlyBlue = new Picture(flower1);
    flowerOnlyBlue.keepOnlyBlue();
    Picture flowerGray = new Picture(flower1);
    flowerGray.grayScale();
    
    this.copy(flower1,0,0);
    this.copy(flowerNegate,100,0);
    this.copy(flowerGray,200,0);
    this.copy(flowerNoBlue,300,0);
    this.copy(flowerOnlyBlue,400,0);
    this.copy(flowerNoBlue,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
