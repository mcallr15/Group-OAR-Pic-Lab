//3)
public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }

//4)
public void negate(){
    Pixel[][] pixels = this.getPixels2D();
    int redColor;
    int greenColor;
    int blueColor;
    
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {   
        redColor = pixelObj.getRed();
        greenColor = pixelObj.getGreen();
        blueColor = pixelObj.getBlue();
        
        pixelObj.setRed(255-redColor);
        pixelObj.setGreen(255-greenColor);
        pixelObj.setBlue(255-blueColor);
      }
    }
  }

//5)
public void grayScale(){
    Pixel[][] pixels = this.getPixels2D();
    int redColor;
    int greenColor;
    int blueColor;
    
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {   
        redColor = pixelObj.getRed();
        greenColor = pixelObj.getGreen();
        blueColor = pixelObj.getBlue();
        
        pixelObj.setBlue((redColor+greenColor+blueColor)/3);
      }
    }
  }

//6)
public void fixUnderwater(){
    Pixel[][] pixels = this.getPixels2D();
    int greenColor = 0;
    int redColor; 
    
     for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {   
        greenColor = pixelObj.getGreen();
        redColor = pixelObj.getRed();
        if(redColor > 20){
            pixelObj.setRed(redColor + 50);
        }
        pixelObj.setGreen(greenColor - 30);
      }
    }
  }
