/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crosstheriver;

import java.awt.image.BufferedImage;

/**
 *
 * @author noureen
 */


public class crosser implements ICrosser
{
    private String canRaft;
    private String Rank;
    private String Weight;
    private String Label;
    

//GETTERS
 @Override
    public boolean canSail() 
    {
        return Boolean.parseBoolean(canRaft); 
    }

    @Override
    public double getWeight() 
    {
        return Double.parseDouble(Weight);
    }

    @Override
    public int getEatingRank() 
    {
        return Integer.parseInt(Rank);
    }
    
    @Override
    public String getLabelToBeShown() 
    {
        return Label;
    }

    @Override
    public BufferedImage[] getImages() 
    {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

   /* @Override
    public ICrosser makeCopy() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
   
    
    
//Setters
    public void setCanRaft(String canRaft) 
    {
        this.canRaft = canRaft;
    }


    public void setRank(String Rank) 
    {
        this.Rank = Rank;
    }


    public void setWeight(String Weight) 
    {
        this.Weight = Weight;
    }
    
    
    @Override
    public void setLabelToBeShown(String Label) 
    {
        this.Label = Label;
    }

    @Override
    public ICrosser makeCopy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
