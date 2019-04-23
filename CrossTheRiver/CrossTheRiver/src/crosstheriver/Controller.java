/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crosstheriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Ahmed Abdel-Moneim
 */
public class Controller implements IRiverCrossingController{
    
    private String LevelSelector;
    private String Moves;
    private String boatSide;
    private ICrosser farmer = new Crosser();///Lev1
    private ICrosser wolf = new Crosser();///Lev1
    private ICrosser goat = new Crosser();///Lev1
    private ICrosser plant = new Crosser();///Lev1
    private ICrosser Animal = new Crosser();///Lev2
    private List <ICrosser> farmersList = (List <ICrosser>) new Crosser();///Lev2
    private List <ICrosser> leftSideCrossers = (List <ICrosser>) new Crosser();///for interface method
    private List <ICrosser> rightSideCrossers = (List <ICrosser>) new Crosser();///for interface method
    private List <ICrosser> crossersLev1 = (List <ICrosser>) new Crosser();///for saving
    private List <ICrosser> crossersLev2 = (List <ICrosser>) new Crosser();///for saving

    @Override
    public void newGame(ICrossingStrategy gameStrategy) {
        
    }

    @Override
    public void resetGame() {
         if (LevelSelector.equals("1")){
            leftSideCrossers.add(farmer);
            leftSideCrossers.add(wolf);
            leftSideCrossers.add(goat);
            leftSideCrossers.add(plant);
            rightSideCrossers.add(null);
            Moves = "0";
            boatSide = "true";
        }
        if(LevelSelector.equals("2")){
            leftSideCrossers.addAll(farmersList);
            leftSideCrossers.add(Animal);
            rightSideCrossers.add(null);
            Moves = "0";
            boatSide = "true";
        }
    }

    @Override
    public String[] getInstructions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ICrosser> getCrossersOnRightBank() {
        return rightSideCrossers;
    }

    @Override
    public List<ICrosser> getCrossersOnLeftBank() {
        return leftSideCrossers;
    }

    @Override
    public boolean isBoatOnTheLeftBank() {
        return Boolean.parseBoolean(boatSide);
    }

    @Override
    public int getNumberOfSails() {
        return Integer.parseInt(Moves);
    }

    @Override
    public boolean canMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canUndo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canRedo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveGame() {
        int i = 0;
        crossersLev1.add(farmer);
        crossersLev1.add(wolf);
        crossersLev1.add(goat);
        crossersLev1.add(plant);
        crossersLev2.addAll(farmersList);
        crossersLev2.add(Animal);
        String leftSide = new String();
        String rightSide = new String();
        for (i = 0; i < leftSideCrossers.size(); i++){
            leftSide = Integer.toString(leftSideCrossers.get(i).getEatingRank()) + " ";
        }
        for (i = 0;i < rightSideCrossers.size(); i++){
            rightSide = Integer.toString(rightSideCrossers.get(i).getEatingRank()) + " ";
        }
        if (LevelSelector.equals("1")){
            i = 0;
            
            /*try{
             DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
             DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
             Document document = documentBuilder.newDocument();
                
             Element root = document.createElement("Crossers");
             document.appendChild(root);
             while (i < crossersLev1.size()){ 
                 ICrosser tt = new Crosser();
                 tt=crossersLev1.get(i);
                Element crosser = document.createElement("crosser");
                root.appendChild(crosser);
                
                Element rank = document.createElement("rank");
                rank.appendChild(document.createTextNode(Integer.toString(tt.getEatingRank())));
                crosser.appendChild(rank);
                
                Element canRaft = document.createElement("canRaft");
                canRaft.appendChild(document.createTextNode(Boolean.toString(tt.canSail())));
                crosser.appendChild(canRaft);

                i++;
                }
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File("CrossersLev1.xml"));
                transformer.transform(domSource, streamResult);
                
            }
            catch (ParserConfigurationException | TransformerException pce) {
        }*/
            try{
                
             DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
             DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
             Document document = documentBuilder.newDocument();
                
             Element root = document.createElement("River");
             document.appendChild(root);
             
                Element bank = document.createElement("bank");
                root.appendChild(bank);
                
                Element side = document.createElement("side");
                side.appendChild(document.createTextNode("left"));
                bank.appendChild(side);
               
                Element crossers = document.createElement("crossers");
                crossers.appendChild(document.createTextNode(leftSide));
                bank.appendChild(crossers);
                
                root.appendChild(bank);
                
                side.appendChild(document.createTextNode("right"));
                bank.appendChild(side);
               
                crossers.appendChild(document.createTextNode(rightSide));
                bank.appendChild(crossers);

                
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File("RiverBanksLev1.xml"));
                transformer.transform(domSource, streamResult);
                
            }
            catch (ParserConfigurationException | TransformerException pce) {
        }
          
            try{
                
             DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
             DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
             Document document = documentBuilder.newDocument();
                
             Element root = document.createElement("State");
             document.appendChild(root);
             
                Element state = document.createElement("state");
                root.appendChild(state);
                
                Element side = document.createElement("moves");
                side.appendChild(document.createTextNode(Moves));
                state.appendChild(side);
               
                Element boat = document.createElement("boat");
                boat.appendChild(document.createTextNode(boatSide));
                state.appendChild(state);
               
 
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File("StateLev1.xml"));
                transformer.transform(domSource, streamResult);
                
            }
            catch (ParserConfigurationException | TransformerException pce) {
        }
            
        }
        
        if (LevelSelector.equals("2")){
            i = 0;
            crossersLev2.addAll(farmersList);
            crossersLev2.add(Animal);
            /*try{
             DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
             DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
             Document document = documentBuilder.newDocument();
                
             Element root = document.createElement("Crossers");
             document.appendChild(root);
             while (i < crossersLev1.size()){ 
                 ICrosser tt = new Crosser();
                 tt=crossersLev1.get(i);
                Element crosser = document.createElement("crosser");
                root.appendChild(crosser);
                
                Element weight = document.createElement("weight");
                weight.appendChild(document.createTextNode(Double.toString(tt.getWeight())));
                crosser.appendChild(weight);
                
                Element canRaft = document.createElement("canRaft");
                canRaft.appendChild(document.createTextNode(Boolean.toString(tt.canSail())));
                crosser.appendChild(canRaft);

                i++;
                }
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File("CrossersLev2.xml"));
                transformer.transform(domSource, streamResult);
                
            }
            catch (ParserConfigurationException | TransformerException pce) {
        } */  
        try{
                
             DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
             DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
             Document document = documentBuilder.newDocument();
                
             Element root = document.createElement("River");
             document.appendChild(root);
             
                Element bank = document.createElement("bank");
                root.appendChild(bank);
                
                Element side = document.createElement("side");
                side.appendChild(document.createTextNode("left"));
                bank.appendChild(side);
               
                Element crossers = document.createElement("crossers");
                crossers.appendChild(document.createTextNode(leftSide));
                bank.appendChild(crossers);
                
                root.appendChild(bank);
                
                side.appendChild(document.createTextNode("right"));
                bank.appendChild(side);
               
                crossers.appendChild(document.createTextNode(rightSide));
                bank.appendChild(crossers);

                
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File("RiverBanksLev2.xml"));
                transformer.transform(domSource, streamResult);
                
            }
            catch (ParserConfigurationException | TransformerException pce) {
        }
        try{
                
             DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
             DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
             Document document = documentBuilder.newDocument();
                
             Element root = document.createElement("State");
             document.appendChild(root);
             
                Element state = document.createElement("state");
                root.appendChild(state);
                
                Element side = document.createElement("moves");
                side.appendChild(document.createTextNode(Moves));
                state.appendChild(side);
               
                Element boat = document.createElement("boat");
                boat.appendChild(document.createTextNode(boatSide));
                state.appendChild(state);
               
 
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File("StateLev2.xml"));
                transformer.transform(domSource, streamResult);
                
            }
            catch (ParserConfigurationException | TransformerException pce) {
        }
        }
        
        
    }
    @Override
    public void loadGame() {
        int i = 0;
        if (LevelSelector.equals("1")){
          
            
        }
        
        if (LevelSelector.equals("2")){
            
            
            
        }
    }
    
}
