package controller;

import model.Circle;
import model.Rectangle;
import model.Triangle;
import repository.ShapeRepository;

import view.Menu;
import repository.IShapeRepository;

public class ShapeManager extends Menu<String>{
    static String[] mc = {"Shape Manager", "Exit"};    
    
    private IShapeRepository shapeRepository; 
    
    public ShapeManager() {
        super("===================== Calculator Shape Program =====================", mc);
        shapeRepository = new ShapeRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:      
                Rectangle rectangle = shapeRepository.inputRectangle();
                Circle circle = shapeRepository.inputCircle();
                Triangle trigle = shapeRepository.inputTriangle();
                shapeRepository.display(trigle, rectangle, circle);
                break;            
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }

    
       
    
}