package repository;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public interface IShapeRepository {
    
    void display(Triangle trigle, Rectangle rectangle, Circle circle);   
    
    Triangle inputTriangle();
    
    Rectangle inputRectangle();
    
    Circle inputCircle();
    
}
